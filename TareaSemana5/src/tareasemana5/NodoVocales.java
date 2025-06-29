/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana5;

/**
 *
 * @author User
 */
public class NodoVocales {
    char vocal;
    int cantidad;
    NodoVocales siguiente;

    public NodoVocales(char vocal) {
        this.vocal = vocal;
        this.cantidad = 0;
        this.siguiente = null;
    }
}
