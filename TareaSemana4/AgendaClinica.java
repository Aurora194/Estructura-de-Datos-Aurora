public class AgendaClinica {
    private Paciente[] pacientes;
    private int contador;

    public AgendaClinica(int capacidad) {
        pacientes = new Paciente[capacidad];
        contador = 0;
    }

    public void agregarTurno(Paciente p) {
        if (contador < pacientes.length) {
            pacientes[contador++] = p;
            System.out.println("Turno agregado exitosamente.\n");
        } else {
            System.out.println("No se pueden agregar más turnos. Capacidad llena.");
        }
    }

    public void mostrarTurnos() {
        System.out.println("\n--- Turnos Registrados ---");
        for (int i = 0; i < contador; i++) {
            pacientes[i].mostrarDatos();
        }
    }

    public void buscarTurno(String cedula) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (pacientes[i].getCedula().equals(cedula)) {
                System.out.println("Turno encontrado:");
                pacientes[i].mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún turno con esa cédula.\n");
        }
    }
}
