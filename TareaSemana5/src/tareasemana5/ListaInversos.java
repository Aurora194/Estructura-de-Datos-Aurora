
package tareasemana5;


/**
 *
 * @author User
 */
public class ListaInversos {
    private NodoInversos cabeza;
    
    
    public ListaInversos(){
        cabeza = null;
    }

    // Insertar al inicio para invertir el orden
    public void insertarAlInicio(int dato) {
        NodoInversos nuevo = new NodoInversos(dato);
        nuevo.siguiente  = cabeza;
        cabeza  = nuevo;
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

