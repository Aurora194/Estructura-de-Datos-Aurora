
package tareasemana5;

/**
 *
 * @author User
 */
public class ListaInversos {
    private NodoInversos cabeza;

    // Insertar al inicio para invertir el orden
    public void insertarAlInicio(int valor) {
        NodoInversos nuevo = new NodoInversos(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // Mostrar la lista separada por comas
    public void mostrarInverso() {
        NodoInversos actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(", ");
            }
            actual = actual.siguiente;
        }
        System.out.println(); // Salto de línea al final
    }
}
