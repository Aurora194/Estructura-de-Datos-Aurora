/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

/**
 *
 * @author User
 */
public class Ejercicio2_Inversos {
    public static void ejecutar() {
        ListaInversos lista = new ListaInversos();

        // Agregar números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            lista.insertarAlInicio(i);
        }
      

        // Mostrar números en orden inverso
        System.out.println("Números en orden inverso:");
        lista.mostrarInverso();
    }
}
