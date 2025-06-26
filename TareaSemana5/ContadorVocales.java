import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorVocales {

    private String palabra; // Almacena la palabra ingresada por el usuario
    private Map<Character, Integer> conteoVocales; // Mapa para almacenar el conteo de cada vocal

    public ContadorVocales() {
        this.conteoVocales = new HashMap<>(); // Inicializa el mapa de conteo
        // Inicializa el conteo de cada vocal a 0
        conteoVocales.put('a', 0);
        conteoVocales.put('e', 0);
        conteoVocales.put('i', 0);
        conteoVocales.put('o', 0);
        conteoVocales.put('u', 0);
    }

    /**
     * Solicita al usuario que ingrese una palabra.
     */
    public void pedirPalabra() {
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada
        System.out.print("Por favor, introduce una palabra: ");
        this.palabra = scanner.nextLine().toLowerCase(); // Lee la palabra y la convierte a minúsculas
        // No cerramos el scanner aquí.
    }

    /**
     * Cuenta el número de veces que cada vocal aparece en la palabra.
     */
    public void contarVocales() {
        for (char caracter : palabra.toCharArray()) { // Itera sobre cada caracter de la palabra
            if (conteoVocales.containsKey(caracter)) { // Si el caracter es una vocal (ya está en el mapa)
                conteoVocales.put(caracter, conteoVocales.get(caracter) + 1); // Incrementa su conteo
            }
        }
    }

    /**
     * Muestra por pantalla el número de veces que contiene cada vocal.
     */
    public void mostrarConteoVocales() {
        System.out.println("Conteo de vocales en la palabra '" + palabra + "':");
        for (Map.Entry<Character, Integer> entry : conteoVocales.entrySet()) { // Itera sobre las entradas del mapa
            System.out.println("  " + entry.getKey() + ": " + entry.getValue()); // Imprime la vocal y su conteo
        }
    }
}
