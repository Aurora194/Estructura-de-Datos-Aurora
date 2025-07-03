
package tareasemana6;
import java.util.Random;
/**
 *
 * @author User
 */

// Clase para manejar una lista enlazada simple llamada ListaEnteros
public class ListaEnteros {
    private NodoEnteros cabeza; // Primer nodo de la lista

    // Constructor
    public ListaEnteros () {
        this.cabeza = null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregarAlFinal(int dato) {
        NodoEnteros nuevo = new NodoEnteros(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoEnteros actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Método para mostrar la lista enlazada
    public void mostrarLista() {
        NodoEnteros actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método para llenar la lista con n números aleatorios entre 1 y 999
    public void llenarConNumerosAleatorios(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int numero = rand.nextInt(999) + 1;
            agregarAlFinal(numero);
        }
    }

    // Método para eliminar nodos fuera de un rango dado
    public void eliminarFueraDeRango(int minimo, int maximo) {
        while (cabeza != null && (cabeza.dato < minimo || cabeza.dato > maximo)) {
            cabeza = cabeza.siguiente; // Eliminar nodos al inicio fuera del rango
        }

        NodoEnteros actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato < minimo || actual.siguiente.dato > maximo) {
                actual.siguiente = actual.siguiente.siguiente; // Eliminar nodo fuera del rango
            } else {
                actual = actual.siguiente;
            }
        }
    }
}

