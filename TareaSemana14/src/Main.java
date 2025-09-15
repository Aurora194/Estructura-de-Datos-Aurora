
// Clase Main.java
// Contiene el menú principal e interacción con el usuario
import java.util.Scanner;

 /**
 * Método principal con menú interactivo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion, valor;

        do {
            System.out.println("\n===== MENU ARBOL BINARIO =====");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Buscar nodo");
            System.out.println("3. Recorrido Inorden");
            System.out.println("4. Recorrido Preorden");
            System.out.println("5. Recorrido Postorden");
            System.out.println("6. Eliminar nodo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    valor = sc.nextInt();
                    arbol.insertar(valor);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a buscar: ");
                    valor = sc.nextInt();
                    if (arbol.buscar(valor)) {
                        System.out.println("El valor " + valor + " SÍ se encuentra en el árbol.");
                    } else {
                        System.out.println("El valor " + valor + " NO está en el árbol.");
                    }
                    break;
                case 3:
                    System.out.println("Recorrido Inorden:");
                    arbol.inOrden();
                    break;
                case 4:
                    System.out.println("Recorrido Preorden:");
                    arbol.preOrden();
                    break;
                case 5:
                    System.out.println("Recorrido Postorden:");
                    arbol.postOrden();
                    break;
                case 6:
                    System.out.print("Ingrese el valor a eliminar: ");
                    valor = sc.nextInt();
                    arbol.eliminar(valor);
                    System.out.println("Nodo eliminado (si existía).");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 7);

        sc.close();
    }
}
