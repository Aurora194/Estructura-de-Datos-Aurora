import java.util.ArrayList;
import java.util.List;

public class Abecedario {

    private List<Character> abecedario; // Lista para almacenar las letras del abecedario

    public Abecedario() {
        this.abecedario = new ArrayList<>(); // Inicializa la lista
        // Llenar la lista con las letras del abecedario (minúsculas)
        for (char c = 'a'; c <= 'z'; c++) {
            abecedario.add(c); // Agrega cada letra desde 'a' hasta 'z'
        }
    }

    /**
     * Elimina de la lista las letras que ocupan posiciones múltiplos de 3.
     * Las posiciones se cuentan desde 1.
     */
    public void filtrarAbecedario() {
        // Importante: Eliminar elementos mientras se itera hacia adelante puede causar problemas
        // ya que los índices cambian. Es mejor iterar hacia atrás o usar un iterador.
        // Aquí optamos por iterar hacia atrás para simplificar el manejo de índices.
        for (int i = abecedario.size() - 1; i >= 0; i--) { // Itera desde el final de la lista
            // Si la posición (i + 1, ya que las posiciones empiezan en 1) es un múltiplo de 3
            if ((i + 1) % 3 == 0) {
                abecedario.remove(i); // Elimina la letra en la posición actual
            }
        }
    }

    /**
     * Muestra por pantalla la lista resultante del abecedario.
     */
    public void mostrarAbecedario() {
        System.out.println("Abecedario después de eliminar múltiplos de 3: " + abecedario);
    }
}