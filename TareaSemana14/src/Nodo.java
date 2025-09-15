
// Clase Nodo.java
// Representa cada elemento (nodo) del árbol binario
public class Nodo {
    int dato;              // Valor que almacena el nodo
    Nodo izquierdo;        // Hijo izquierdo
    Nodo derecho;          // Hijo derecho

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}
