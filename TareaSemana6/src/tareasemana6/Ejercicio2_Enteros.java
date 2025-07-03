
package tareasemana6;
import java.util.Scanner;
/**
 *
 * @author User
 */

// Clase principal para probar la creación y limpieza de la lista enlazada
public class Ejercicio2_Enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnteros lista = new ListaEnteros();

        // Llenamos la lista con 50 números aleatorios del 1 al 999
        lista.llenarConNumerosAleatorios(50);
        System.out.println("Lista original con 50 números aleatorios:");
        lista.mostrarLista();

        // Leer el rango desde el teclado
        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = scanner.nextInt();
        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        // Eliminar los nodos fuera del rango
        lista.eliminarFueraDeRango(minimo, maximo);

        System.out.println("Lista después de eliminar nodos fuera del rango:");
        lista.mostrarLista();

        scanner.close();
    }
}
