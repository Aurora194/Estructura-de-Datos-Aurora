
package Clases;

// Clase para modelar un Círculo
public class Circulo {
    // Atributo privado que indica la medida del radio del círculo
    private double radio;

    // Constructor para establecer el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para determinar el área del círculo
    // El área se determina mediante π * radio^2
    public double CalcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para determinar el perímetro (circunferencia)
    // Se determina como 2 * π * radio
    public double CalcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

