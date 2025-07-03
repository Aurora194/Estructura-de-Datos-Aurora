
package tareasemana6;

/**
 *
 * @author User
 */
// Clase para manejar una lista enlazada simple llamada ListaInvertido
public class ListaEnlazada {
    private NodoInvertido cabeza; // Primer nodo de la lista

    // Constructor
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregarAlFinal(int dato) {
        NodoInvertido nuevo = new NodoInvertido(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoInvertido actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Método para mostrar la lista
    public void mostrarLista() {
        NodoInvertido actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método para invertir la lista enlazada
    public void invertirLista() {
        NodoInvertido anterior = null;
        NodoInvertido actual = cabeza;
        NodoInvertido siguiente = null;

        while (actual != null) {
            siguiente = actual.siguiente;   // Guardar el siguiente nodo
            actual.siguiente = anterior;    // Invertir el enlace
            anterior = actual;              // Mover anterior una posición adelante
            actual = siguiente;             // Mover actual una posición adelante
        }

        cabeza = anterior;  // Actualizar la cabeza al nuevo primer nodo
    }
}
