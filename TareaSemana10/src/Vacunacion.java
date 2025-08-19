import java.util.HashSet;
import java.util.Set;

public class Vacunacion {

    // Genera el conjunto universal de 500 ciudadanos
    public static Set<String> generarCiudadanos(int cantidad) {
        Set<String> ciudadanos = new HashSet<>();
        for (int i = 1; i <= cantidad; i++) {
            ciudadanos.add("Ciudadano " + i);
        }
        return ciudadanos;
    }

    // Genera un subconjunto de ciudadanos vacunados con cierta vacuna
    public static Set<String> generarVacunados(Set<String> universo, int cantidad, int semilla) {
        Set<String> vacunados = new HashSet<>();
        int i = 0;
        for (String c : universo) {
            if (i % semilla == 0 && vacunados.size() < cantidad) {
                vacunados.add(c);
            }
            i++;
        }
        return vacunados;
    }

    // Operación de diferencia (A - B)
    public static Set<String> diferencia(Set<String> A, Set<String> B) {
        Set<String> resultado = new HashSet<>(A);
        resultado.removeAll(B);
        return resultado;
    }

    // Operación de intersección (A ∩ B)
    public static Set<String> interseccion(Set<String> A, Set<String> B) {
        Set<String> resultado = new HashSet<>(A);
        resultado.retainAll(B);
        return resultado;
    }

    // Operación de unión (A ∪ B)
    public static Set<String> union(Set<String> A, Set<String> B) {
        Set<String> resultado = new HashSet<>(A);
        resultado.addAll(B);
        return resultado;
    }
}
