
package Clases;

// Clase para representar un Rectángulo
public class Rectangulo {
    // Atributos privados para base y altura
    private double base;
    private double altura;

    // Constructor para inicializar base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    // Área = base * altura
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    // Perímetro = 2 * (base + altura)
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

