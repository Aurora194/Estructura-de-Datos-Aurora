
package pratico2;

/**
 * Clase Nodo que representa un nodo genérico para una cola.
 * Contiene un objeto Persona y un puntero al siguiente nodo.
 */
public class Nodo {
    Persona persona;   // Datos de la persona en el nodo
    Nodo siguiente;   // Referencia al siguiente nodo en la cola

    // Constructor
    public Nodo(Persona persona) {
        this.persona = persona;
        this.siguiente = null;
    }
}
