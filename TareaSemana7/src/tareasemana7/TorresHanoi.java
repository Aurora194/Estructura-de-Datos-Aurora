
package tareasemana7;

import java.util.Stack;

/**
 *
 * @author User
 */
public class TorresHanoi {
     // Método para mover discos entre las torres
    public static void moverDiscos(int n, Stack<Integer> origen, Stack<Integer> destino, Stack<Integer> auxiliar,
                                   String nombreOrigen, String nombreDestino, String nombreAuxiliar) {
        if (n == 1) {
            // Caso base: mover un solo disco
            destino.push(origen.pop());
            System.out.println("Mover disco de " + nombreOrigen + " a " + nombreDestino);
            return;
        }

        // Paso 1: mover n-1 discos a la torre auxiliar
        moverDiscos(n - 1, origen, auxiliar, destino, nombreOrigen, nombreAuxiliar, nombreDestino);

        // Paso 2: mover el disco restante a la torre destino
        destino.push(origen.pop());
        System.out.println("Mover disco de " + nombreOrigen + " a " + nombreDestino);

        // Paso 3: mover los n-1 discos desde la torre auxiliar a la destino
        moverDiscos(n - 1, auxiliar, destino, origen, nombreAuxiliar, nombreDestino, nombreOrigen);
    }

    public static void main(String[] args) {
        int numDiscos = 3;

        // Creamos las tres pilas que representan las torres
        Stack<Integer> torreA = new Stack<>();
        Stack<Integer> torreB = new Stack<>();
        Stack<Integer> torreC = new Stack<>();

        // Colocamos los discos en la torre A (del mayor al menor)
        for (int i = numDiscos; i >= 1; i--) {
            torreA.push(i);
        }

        // Llamamos al método recursivo para resolver el problema
        System.out.println("Resolviendo Torres de Hanoi con " + numDiscos + " discos:\n");
        moverDiscos(numDiscos, torreA, torreC, torreB, "Torre A", "Torre C", "Torre B");
    }
}
