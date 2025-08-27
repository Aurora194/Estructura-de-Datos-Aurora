import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TraductorBasico {

    // Diccionario inglés -> español
    private static Map<String, String> diccionario = new HashMap<>();

    public static void main(String[] args) {
        inicializarDiccionario(); // Cargar palabras base

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    traducirFrase(sc);
                    break;
                case 2:
                    agregarPalabra(sc);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // Método para inicializar el diccionario con palabras base
    private static void inicializarDiccionario() {
        diccionario.put("time", "tiempo");
        diccionario.put("person", "persona");
        diccionario.put("year", "año");
        diccionario.put("way", "camino");
        diccionario.put("day", "día");
        diccionario.put("thing", "cosa");
        diccionario.put("man", "hombre");
        diccionario.put("world", "mundo");
        diccionario.put("life", "vida");
        diccionario.put("hand", "mano");
        diccionario.put("part", "parte");
        diccionario.put("child", "niño");
        diccionario.put("eye", "ojo");
        diccionario.put("woman", "mujer");
        diccionario.put("place", "lugar");
        diccionario.put("work", "trabajo");
        diccionario.put("week", "semana");
        diccionario.put("case", "caso");
        diccionario.put("point", "punto");
        diccionario.put("government", "gobierno");
        diccionario.put("company", "empresa");
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n==================== MENÚ ====================");
        System.out.println("1. Traducir una frase");
        System.out.println("2. Agregar palabras al diccionario");
        System.out.println("0. Salir");
        System.out.println("==============================================");
    }

    // Método para traducir una frase
    private static void traducirFrase(Scanner sc) {
        System.out.print("Ingrese la frase a traducir: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" "); // Separar por espacios
        StringBuilder traduccion = new StringBuilder();

        for (String palabra : palabras) {
            // Limpiar puntuación
            String clave = palabra.toLowerCase().replaceAll("[^a-zA-Z]", "");
            String traducida = diccionario.getOrDefault(clave, palabra);
            
            // Mantener la puntuación original
            String puntuacion = palabra.replaceAll("[a-zA-Z]", "");
            traduccion.append(traducida).append(puntuacion).append(" ");
        }

        System.out.println("Traducción: " + traduccion.toString().trim());
    }

    // Método para agregar palabras al diccionario
    private static void agregarPalabra(Scanner sc) {
        System.out.print("Ingrese la palabra en inglés: ");
        String ingles = sc.nextLine().toLowerCase();

        System.out.print("Ingrese la traducción al español: ");
        String espanol = sc.nextLine().toLowerCase();

        diccionario.put(ingles, espanol);
        System.out.println("Palabra agregada correctamente.");
    }
}
