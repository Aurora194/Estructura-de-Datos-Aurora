
package tareasemana6;

/**
 *
 * @author User
 */
// Clase principal para probar la lista enlazada e invertirla
public class Ejercicio1_Invertido {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Agregamos datos a la lista
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlFinal(40);
        lista.agregarAlFinal(50);

        System.out.println("Lista original:");
        lista.mostrarLista();

        // Invertimos la lista
        lista.invertirLista();

        System.out.println("Lista invertida:");
        lista.mostrarLista();
    }

}
