package tareasemana5;
public class ListaAsignaturas {
    private NodoAsignaturas cabeza;

        public void insertar(String asignatura, int nota) {
            NodoAsignaturas nuevo = new NodoAsignaturas(asignatura, nota);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                NodoAsignaturas actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }

        public void mostrarReprobadas() {
            NodoAsignaturas actual = cabeza;
            System.out.println("Asignaturas que debes repetir:");
            while (actual != null) {
                if (actual.nota < 7) {
                    System.out.println("- " + actual.asignatura);
                }
                actual = actual.siguiente;
            }
        }
 
}
