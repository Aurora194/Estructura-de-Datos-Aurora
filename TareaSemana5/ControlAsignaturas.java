import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControlAsignaturas {

    private List<String> asignaturas; // Lista para almacenar los nombres de las asignaturas
    private List<String> asignaturasARepetir; // Lista para almacenar las asignaturas a repetir

    public ControlAsignaturas() {
        this.asignaturas = new ArrayList<>(); // Inicializa la lista de asignaturas
        this.asignaturasARepetir = new ArrayList<>(); // Inicializa la lista de asignaturas a repetir

        // Agrega las asignaturas predefinidas
        asignaturas.add("Matemáticas");
        asignaturas.add("Física");
        asignaturas.add("Química");
        asignaturas.add("Historia");
        asignaturas.add("Lengua");
    }

    /**
     * Pregunta al usuario la nota de cada asignatura y determina cuáles debe repetir.
     */
    public void procesarNotas() {
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada
        System.out.println("Por favor, introduce la nota obtenida en cada asignatura:");

        // Usamos un iterador para poder eliminar elementos de la lista mientras la recorremos
        Iterator<String> iterator = asignaturas.iterator();
        while (iterator.hasNext()) { // Mientras haya elementos en la lista de asignaturas
            String asignatura = iterator.next(); // Obtiene la asignatura actual
            System.out.print(asignatura + ": ");

            double nota;
            while (true) { // Bucle para validar la entrada de la nota
                if (scanner.hasNextDouble()) { // Verifica si la entrada es un número decimal
                    nota = scanner.nextDouble();
                    if (nota >= 0 && nota <= 10) { // Valida que la nota esté en el rango 0-10
                        break; // Sale del bucle si la nota es válida
                    } else {
                        System.out.println("Nota fuera de rango. Por favor, introduce una nota entre 0 y 10.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, introduce un número para la nota.");
                    scanner.next(); // Consume la entrada inválida
                }
                System.out.print(asignatura + ": "); // Vuelve a pedir la nota
            }

            if (nota < 7.0) { // Si la nota es menor a 7 (considerando 7 como nota mínima para aprobar)
                asignaturasARepetir.add(asignatura); // Agrega la asignatura a la lista de asignaturas a repetir
            }
            // Las asignaturas aprobadas simplemente no se agregan a asignaturasARepetir.
            // No necesitamos eliminarlas explícitamente de la lista 'asignaturas' si solo nos interesan las reprobadas.
        }
        // No cerramos el scanner aquí.
    }

    /**
     * Muestra por pantalla las asignaturas que el usuario tiene que repetir.
     */
    public void mostrarAsignaturasARepetir() {
        if (asignaturasARepetir.isEmpty()) { // Si la lista de asignaturas a repetir está vacía
            System.out.println("¡Felicidades! Has aprobado todas las asignaturas.");
        } else {
            System.out.println("Tienes que repetir las siguientes asignaturas: " + asignaturasARepetir);
        }
    }
}