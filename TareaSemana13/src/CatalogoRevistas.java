import java.util.Scanner;

/**
 * Aplicación para gestionar un catálogo de revistas y realizar búsquedas.
 * Desarrollada en Java con búsqueda recursiva.
 * 
 * @author 
 */
public class CatalogoRevistas {

    // Catálogo de revistas (arreglo estático con al menos 10 títulos)
    private static String[] revistas = {
        "National Geographic",
        "Scientific American",
        "Nature",
        "Time",
        "Forbes",
        "Vogue",
        "The Economist",
        "Sports Illustrated",
        "Popular Science",
        "Reader's Digest"
    };

    /**
     * Método principal con menú interactivo
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== Catálogo de Revistas =====");
            System.out.println("1. Buscar revista por título");
            System.out.println("2. Mostrar catálogo completo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título a buscar: ");
                    String titulo = scanner.nextLine();
                    boolean encontrado = busquedaRecursiva(revistas, titulo, 0);
                    if (encontrado) {
                        System.out.println(">>> Encontrado");
                    } else {
                        System.out.println(">>> No encontrado");
                    }
                    break;
                case 2:
                    mostrarCatalogo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    /**
     * Método recursivo para buscar un título en el catálogo.
     *
     * @param lista  Arreglo de títulos
     * @param titulo Título a buscar
     * @param indice Posición actual en el arreglo
     * @return true si encuentra el título, false en caso contrario
     */
    public static boolean busquedaRecursiva(String[] lista, String titulo, int indice) {
        // Caso base: si llegamos al final del arreglo
        if (indice >= lista.length) {
            return false;
        }
        // Si encontramos coincidencia (ignorando mayúsculas/minúsculas)
        if (lista[indice].equalsIgnoreCase(titulo)) {
            return true;
        }
        // Llamada recursiva al siguiente índice
        return busquedaRecursiva(lista, titulo, indice + 1);
    }

    /**
     * Muestra el catálogo completo de revistas
     */
    public static void mostrarCatalogo() {
        System.out.println("\n--- Catálogo de Revistas ---");
        for (String revista : revistas) {
            System.out.println("- " + revista);
        }
    }
}
