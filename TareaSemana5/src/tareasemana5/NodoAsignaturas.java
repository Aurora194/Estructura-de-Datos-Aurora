package tareasemana5;
/**
 *
 * @author User
 */
public class NodoAsignaturas {
    String asignatura;
    double nota;
    NodoAsignaturas siguiente;

    public NodoAsignaturas(String asignatura, double nota) {
        this.asignatura = asignatura;
        this.nota = nota;
        this.siguiente = null;
    }
}
