package Clases;

// Clase para representar un Círculo
public class Circulo {



    // Atributo privado para almacenar el radio
    private double radio;

    // Constructor para inicializar el radio del círculo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área de un círculo
    // Área = PI * radio^2
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro (circunferencia) de un círculo
    // Perímetro = 2 * PI * radio
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }


}
