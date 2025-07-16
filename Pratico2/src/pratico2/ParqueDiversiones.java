
package pratico2;

/**
 * Clase ParqueDiversiones que gestiona la cola de personas que esperan subir a la atracción.
 */
public class ParqueDiversiones {
    private Cola colaPersonas;  // Cola para las personas en espera
    private final int capacidadAsientos = 30;  // Número máximo de asientos

    // Constructor
    public ParqueDiversiones() {
        colaPersonas = new Cola();
    }

    /**
     * Método para agregar personas a la cola de espera
     */
    public void agregarPersona(Persona persona) {
        if (colaPersonas.getTamaño() < capacidadAsientos) {
            colaPersonas.encolar(persona);
            System.out.println(persona.getNombre() + " agregado a la cola.");
        } else {
            System.out.println("Ya no hay asientos disponibles para agregar a " + persona.getNombre());
        }
    }

    /**
     * Método para asignar asientos y que las personas suban a la atracción en orden
     */
    public void asignarAsientos() {
        System.out.println("\nAsignando asientos en orden de llegada:");
        int asientoNum = 1;

        while (!colaPersonas.estaVacia() && asientoNum <= capacidadAsientos) {
            Persona personaAtendida = colaPersonas.desencolar();
            System.out.println("Asiento #" + asientoNum + " asignado a " + personaAtendida.getNombre());
            asientoNum++;
        }

        if (!colaPersonas.estaVacia()) {
            System.out.println("Quedan personas en la cola que no alcanzaron asiento.");
        } else {
            System.out.println("Todos los asientos han sido asignados.");
        }
    }

    /**
     * Método para mostrar la cola actual
     */
    public void mostrarCola() {
        colaPersonas.mostrarCola();
    }
}
