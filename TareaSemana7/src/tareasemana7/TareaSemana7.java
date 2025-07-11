
package tareasemana7;

import java.util.Stack;

/**
 *
 * @author User
 */
public class TareaSemana7 {

   
 // Método que verifica si los paréntesis están balanceados
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        // Recorremos cada carácter de la expresión
        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);  // Si es un símbolo de apertura, lo apilamos
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;  // Si hay un símbolo de cierre sin apertura previa
                }
                char topo = pila.pop();  // Sacamos el último símbolo abierto
                // Verificamos que el cierre coincida con la apertura
                if ((c == ')' && topo != '(') ||
                    (c == ']' && topo != '[') ||
                    (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        // Si al final la pila está vacía, todo estuvo balanceado
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String expresion = "{7 + (8 * 5) - [(9 - 7) + (4 + 1)]}";
        if (estaBalanceado(expresion)) {
            System.out.println("Fórmula balanceada.");
        } else {
            System.out.println("Fórmula desbalanceada.");
        }
    }
}
