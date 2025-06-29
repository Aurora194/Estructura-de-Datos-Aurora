package tareasemana5;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio4_ControlAsignaturas {

      public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        
        // Lista inicial de materias
        String[] materias = {"Matemáticas", "Física", "Química", "Historia", "Lengua"};
        ListaAsignaturas lista = new ListaAsignaturas();
        
        // Pedir notas al usuario y eliminar aprobadas
        for (String materia : materias) {
            System.out.print("Nota en " + materia + ": ");
            int nota = sc.nextInt();
            lista.insertar(materia, nota);
        }
        // Mostrar materias reprobadas
        lista.mostrarReprobadas();
    }
}
