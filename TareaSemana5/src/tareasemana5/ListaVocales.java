/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

/**
 *
 * @author User
 */
public class ListaVocales {
            NodoVocales cabeza;

        public ListaVocales() {
            insertar('a');
            insertar('e');
            insertar('i');
            insertar('o');
            insertar('u');
        }

        public void insertar(char vocal) {
            NodoVocales nuevo = new NodoVocales(vocal);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                NodoVocales actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }

        public void contarVocales(String palabra) {
            palabra = palabra.toLowerCase();
            for (char c : palabra.toCharArray()) {
                NodoVocales actual = cabeza;
                while (actual != null) {
                    if (actual.vocal == c) {
                        actual.cantidad++;
                        break;
                    }
                    actual = actual.siguiente;
                }
            }
        }

        public void mostrar() {
            NodoVocales actual = cabeza;
            System.out.println("Cantidad de cada vocal:");
            while (actual != null) {
                System.out.println(actual.vocal + ": " + actual.cantidad);
                actual = actual.siguiente;
            }
        }
    }

