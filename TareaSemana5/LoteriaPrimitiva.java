import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoteriaPrimitiva {

    private List<Integer> numerosGanadores; // Lista para almacenar los números ganadores

    public LoteriaPrimitiva() {
        this.numerosGanadores = new ArrayList<>(); // Inicializa la lista de números
    }

    /**
     * Solicita al usuario que ingrese los números ganadores de la lotería.
     * Se pedirán 6 números.
     */
    public void pedirNumeros() {
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        System.out.println("Por favor, introduce los 6 números ganadores de la lotería primitiva:");

        for (int i = 0; i < 6; i++) { // Bucle para pedir 6 números
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) { // Valida que la entrada sea un entero
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                scanner.next(); // Consume la entrada inválida
                System.out.print("Número " + (i + 1) + ": ");
            }
            numerosGanadores.add(scanner.nextInt()); // Agrega el número a la lista
        }
        // No cerramos el scanner aquí para que la clase principal pueda reutilizarlo o cerrarlo al final.
    }

    /**
     * Ordena los números ganadores de menor a mayor.
     */
    public void ordenarNumeros() {
        Collections.sort(numerosGanadores); // Utiliza Collections.sort para ordenar la lista
    }

    /**
     * Muestra por pantalla los números ganadores ordenados.
     */
    public void mostrarNumeros() {
        System.out.println("Los números ganadores de la lotería primitiva (ordenados) son: " + numerosGanadores);
    }
}