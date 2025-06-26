import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosInversos {

    private List<Integer> numeros; // Lista para almacenar los números

    public NumerosInversos() {
        this.numeros = new ArrayList<>(); // Inicializa la lista
        // Llenar la lista con números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i); // Agrega los números del 1 al 10 a la lista
        }
    }

    /**
     * Muestra los números de la lista en orden inverso, separados por comas.
     */
    public void mostrarNumerosInversos() {
        // Para mostrar en orden inverso sin modificar la lista original, podemos iterar desde el final
        StringBuilder sb = new StringBuilder(); // StringBuilder para construir la cadena de salida eficiente
        for (int i = numeros.size() - 1; i >= 0; i--) { // Itera la lista desde el último elemento
            sb.append(numeros.get(i)); // Agrega el número actual al StringBuilder
            if (i > 0) {
                sb.append(", "); // Agrega coma y espacio si no es el último elemento
            }
        }
        System.out.println("Números del 1 al 10 en orden inverso: " + sb.toString());
    }
}