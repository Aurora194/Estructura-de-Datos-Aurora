/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

/**
 *
 * @author User
 */
public class ListaAbecedario {
     NodoAbecedario cabeza;

        public void insertar(char letra) {
            NodoAbecedario nuevo = new NodoAbecedario(letra);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                NodoAbecedario actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }

        public void eliminarMultiploDeTres() {
            NodoAbecedario actual = cabeza;
            NodoAbecedario anterior = null;
            int posicion = 1;

            while (actual != null) {
                if (posicion % 3 == 0) {
                    if (anterior == null) {
                        cabeza = actual.siguiente;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                } else {
                    anterior = actual;
                }
                actual = actual.siguiente;
                posicion++;
            }
        }

        public void mostrar() {
            NodoAbecedario actual = cabeza;
            System.out.print("Letras restantes: ");
            while (actual != null) {
                System.out.print(actual.letra + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }
    
}
