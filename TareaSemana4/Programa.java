
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgendaClinica agenda = new AgendaClinica(100);
        int opcion;

        do {
            System.out.println("\n--- Agenda Clínica ---");
            System.out.println("1. Agregar Turno");
            System.out.println("2. Ver Turnos");
            System.out.println("3. Buscar Turno");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cédula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese motivo de consulta: ");
                    String motivo = sc.nextLine();
                    System.out.print("Ingrese fecha (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Ingrese hora (hh:mm): ");
                    String hora = sc.nextLine();

                    Paciente p = new Paciente(cedula, nombre, motivo, fecha, hora);
                    agenda.agregarTurno(p);
                    break;

                case 2:
                    agenda.mostrarTurnos();
                    break;

                case 3:
                    System.out.print("Ingrese la cédula a buscar: ");
                    String ced = sc.nextLine();
                    agenda.buscarTurno(ced);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}


