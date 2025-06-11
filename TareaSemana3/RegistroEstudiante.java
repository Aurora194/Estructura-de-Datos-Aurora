

import java.util.Scanner;

// Archivo: RegistroEstudiante.java
public class RegistroEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitud de datos al usuario
        System.out.println("Ingrese los datos del estudiante");

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine()); // Leer como String y convertir a int

        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        // Creación del arreglo para teléfonos
        String[] telefonos = new String[3];
        for (int i = 0; i < telefonos.length; i++) {
            System.out.print("Teléfono " + (i + 1) + ": ");
            telefonos[i] = scanner.nextLine();
        }

        // Crear el objeto Estudiante utilizando el constructor1
        Estudiante estudiante = new Estudiante(id, nombres, apellidos, direccion, telefonos);

        // Mostrar la información ingresada
        estudiante.mostrarInformacion();

        scanner.close();
    }
}
