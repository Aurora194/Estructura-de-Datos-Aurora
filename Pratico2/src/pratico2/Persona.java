
package pratico2;

/**
 * Clase Persona que representa una persona con un id y un nombre.
 */
public class Persona {
    private int id;         // ID o número de orden de llegada
    private String nombre;  // Nombre de la persona

    // Constructor
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona ID: " + id + ", Nombre: " + nombre;
    }
}
