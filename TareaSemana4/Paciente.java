public class Paciente {
    private String cedula;
    private String nombre;
    private String motivo;
    private String fecha;
    private String hora;

    public Paciente(String cedula, String nombre, String motivo, String fecha, String hora) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.motivo = motivo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getCedula() {
        return cedula;
    }

    public void mostrarDatos() {
        System.out.println("Cédula: " + cedula + ", Nombre: " + nombre +
                           ", Motivo: " + motivo + ", Fecha: " + fecha + ", Hora: " + hora);
    }
}
