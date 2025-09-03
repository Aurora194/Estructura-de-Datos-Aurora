// Clase que representa un libro
public class Libros {
    private String codigo;
    private String titulo;
    private String autor;
    private int anio;

    public Libros(String codigo, String titulo, String autor, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnio() { return anio; }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Título: " + titulo + " | Autor: " + autor + " | Año: " + anio;
    }
}
