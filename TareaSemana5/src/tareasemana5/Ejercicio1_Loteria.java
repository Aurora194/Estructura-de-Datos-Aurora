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
public class Ejercicio1_Loteria {
        public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ListaLoteria lista = new ListaLoteria();
        System.out.println("\nIngrese 6 números ganadores de la lotería:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            lista.insertar(num);
        }
        lista.mostrar();
    }
}
