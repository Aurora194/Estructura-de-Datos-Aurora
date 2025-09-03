import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Libreria {
    private Map<String, Libros> libros;  // Mapa de código a Libro
    private Set<String> codigos;        // Conjunto de códigos únicos

    public Libreria() {
        libros = new HashMap<>();
        codigos = new HashSet<>();
    }

    // Agregar libro
    public boolean agregarLibro(Libros libro) {
        if (codigos.add(libro.getCodigo())) {  // HashSet asegura que no haya duplicados
            libros.put(libro.getCodigo(), libro);
            return true;
        }
        return false;  // Código ya existente
    }

    // Buscar libro por código
    public Libros buscarLibro(String codigo) {
        return libros.get(codigo);
    }

    // Eliminar libro
    public boolean eliminarLibro(String codigo) {
        if (codigos.remove(codigo)) {  // Quitar del conjunto
            libros.remove(codigo);     // Quitar del mapa
            return true;
        }
        return false;
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("📚 Libros en la Biblioteca:");
            for (Libros libro : libros.values()) {
                System.out.println(libro);
            }
        }
    }

    // Mostrar todos los códigos (conjunto explícito)
    public void mostrarCodigos() {
        System.out.println("🔹 Códigos de libros registrados (conjunto): " + codigos);
    }
}
