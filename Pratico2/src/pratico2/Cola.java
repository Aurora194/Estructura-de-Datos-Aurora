
package pratico2;

/**
 * Clase Cola que implementa una cola usando nodos.
 * Se garantiza el orden FIFO para atender a las personas.
 */
public class Cola {
    private Nodo frente;   // Frente de la cola
    private Nodo finalCola; // Final de la cola
    private int tamaño;    // Tamaño actual de la cola

    // Constructor
    public Cola() {
        this.frente = null;
        this.finalCola = null;
        this.tamaño = 0;
    }

    /**
     * Método para encolar una persona en la cola
     */
    public void encolar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);

        if (finalCola == null) {  // Cola vacía
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
        tamaño++;
    }

    /**
     * Método para desencolar (quitar) una persona del frente de la cola
     */
    public Persona desencolar() {
        if (frente == null) {
            System.out.println("La cola está vacía, no se puede desencolar.");
            return null;
        }

        Persona personaAtendida = frente.persona;
        frente = frente.siguiente;

        if (frente == null) {
            finalCola = null;  // Cola vacía
        }
        tamaño--;
        return personaAtendida;
    }

    /**
     * Método para consultar el tamaño de la cola
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Método para mostrar todas las personas en la cola en orden
     */
    public void mostrarCola() {
        if (frente == null) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.println("Personas en la cola:");
        Nodo actual = frente;
        while (actual != null) {
            System.out.println(actual.persona);
            actual = actual.siguiente;
        }
    }

    /**
     * Método para consultar si la cola está vacía
     */
    public boolean estaVacia() {
        return frente == null;
    }
}
