/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio5_ContadorVocales {
        public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        ListaVocales lista = new ListaVocales();
        lista.contarVocales(palabra);
        lista.mostrar();
    }
}
