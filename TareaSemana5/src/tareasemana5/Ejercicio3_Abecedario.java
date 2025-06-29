/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

/**
 *
 * @author User
 */
public class Ejercicio3_Abecedario {
        public static void ejecutar() {
        ListaAbecedario abecedario = new ListaAbecedario();
        for (char c = 'A'; c <= 'Z'; c++) {
            abecedario.insertar(c);
        }
        abecedario.eliminarMultiploDeTres();
        abecedario.mostrar();
    }
}
