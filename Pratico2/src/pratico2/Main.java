
package pratico2;

import java.util.Scanner;

/**
 * Clase principal para probar la simulación de asignación de asientos en la atracción
 */
public class Main {
    public static void main(String[] args) {
        ParqueDiversiones parque = new ParqueDiversiones();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulación de asignación de 30 asientos en orden de llegada\n");

        // Vamos a simular agregando 30 personas automáticamente
        for (int i = 1; i <= 30; i++) {
            Persona persona = new Persona(i, "Persona_" + i);
            parque.agregarPersona(persona);
        }

        // Mostrar la cola actual
        System.out.println("\nCola antes de asignar asientos:");
        parque.mostrarCola();

        // Asignar asientos en orden de llegada
        parque.asignarAsientos();

        // Mostrar cola después de asignar asientos (debería estar vacía)
        System.out.println("\nCola después de asignar asientos:");
        parque.mostrarCola();

        scanner.close();
    }
}
