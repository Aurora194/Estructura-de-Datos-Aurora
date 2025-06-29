/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

/**
 *
 * @author User
 */
public class ListaLoteria {
      NodoLoteria cabeza;

        public void insertar(int dato) {
            NodoLoteria nuevo = new NodoLoteria(dato);
            if (cabeza == null || dato < cabeza.numero) {
                nuevo.siguiente = cabeza;
                cabeza = nuevo;
            } else {
                NodoLoteria actual = cabeza;
                while (actual.siguiente != null && actual.siguiente.numero < dato) {
                    actual = actual.siguiente;
                }
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
            }
        }

        public void mostrar() {
            NodoLoteria actual = cabeza;
            System.out.print("Números ordenados: ");
            while (actual != null) {
                System.out.print(actual.numero + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }
    
}
