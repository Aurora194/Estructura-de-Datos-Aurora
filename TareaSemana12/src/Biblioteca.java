import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int opcion;

        do {
            System.out.println("\n=== Menú Biblioteca ===");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Mostrar todos los códigos (Conjunto)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    Libros nuevo = new Libros(codigo, titulo, autor, anio);
                    if (libreria.agregarLibro(nuevo)) {
                        System.out.println("✅ Libro agregado correctamente.");
                    } else {
                        System.out.println("⚠️ Ya existe un libro con ese código.");
                    }
                }

                case 2 -> {
                    System.out.print("Ingrese código del libro: ");
                    String codBuscar = sc.nextLine();
                    Libros encontrado = libreria.buscarLibro(codBuscar);
                    if (encontrado != null) {
                        System.out.println("📖 Libro encontrado: " + encontrado);
                    } else {
                        System.out.println("❌ No se encontró el libro.");
                    }
                }

                case 3 -> libreria.mostrarLibros();

                case 4 -> {
                    System.out.print("Ingrese código del libro a eliminar: ");
                    String codEliminar = sc.nextLine();
                    if (libreria.eliminarLibro(codEliminar)) {
                        System.out.println("🗑️ Libro eliminado.");
                    } else {
                        System.out.println("❌ No existe un libro con ese código.");
                    }
                }

                case 5 -> libreria.mostrarCodigos();

                case 6 -> System.out.println("👋 Saliendo del sistema...");

                default -> System.out.println("⚠️ Opción inválida.");
            }
        } while (opcion != 6);
    }
}
