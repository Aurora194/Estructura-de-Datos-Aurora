// Archivo: Estudiante.java

public class Estudiante {
    // Atributos de la clase
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String[] telefonos;

    // Constructor de la clase
    public Estudiante(int id, String nombres, String apellidos, String direccion, String[] telefonos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("\n--- Información del Estudiante ---");
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfonos:");
        for (int i = 0; i < telefonos.length; i++) {
            System.out.println("Teléfono " + (i + 1) + ": " + telefonos[i]);
        }
    }
}
