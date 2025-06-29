
package tareasemana5;
import java.util.Scanner;
/**
 *
 * @author User
 */


public class TareaSemana5 {

    /**
     * @param args the command line arguments
     */       
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=============================");
            System.out.println("   MENÚ DE EJERCICIOS JAVA   ");
            System.out.println("=============================");
            System.out.println("1. Ejercicio 1 - Lotería Primitiva");
            System.out.println("2. Ejercicio 2 - Números del 1 al 10 en orden inverso");
            System.out.println("3. Ejercicio 3 - Abecedario sin múltiplos de 3");
            System.out.println("4. Ejercicio 4 - Control de asignaturas");
            System.out.println("5. Ejercicio 5 - Contador de vocales");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    Ejercicio1_Loteria.ejecutar();
                    break;
                case 2:
                    Ejercicio2_Inversos.ejecutar();
                    break;
                case 3:
                    Ejercicio3_Abecedario.ejecutar();
                    break;
                case 4:
                    Ejercicio4_ControlAsignaturas.ejecutar();
                    break;
                case 5:
                    Ejercicio5_ContadorVocales.ejecutar();
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
