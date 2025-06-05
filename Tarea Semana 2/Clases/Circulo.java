package Clases;


// Clase para representar un Círculo
public class Circulo {
    // Atributo privado que representa el radio del círculo
    private double radio;

    // Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    // El área se calcula como π * radio^2
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro (circunferencia)
    // Se calcula como 2 * π * radio
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

