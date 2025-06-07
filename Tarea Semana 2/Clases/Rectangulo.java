
package Clases;

// Clase para mostrar un Rectángulo
public class Rectangulo {
    // Atributos privados para la base y la altura
    private double base;
    private double altura;

    // Constructor para establecer la base y la altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para determinar la superficie del rectángulo
    // Área = base * altura
    public double CalcularArea() {
        return base * altura;
    }

    // Forma de determinar el perímetro de un rectángulo
    // Perímetro = 2 * (base + altura)
    public double CalcularPerimetro() {
        return 2 * (base + altura);
    }
}

