
// Clase principal para probar las figuras

import Clases.Circulo;
import Clases.Rectangulo;

public class FigurasGeometricas {
    public static void main(String[] args) {
        // Crear un objeto de tipo Círculo con radio 5.0
        Circulo miCirculo = new Circulo(5.0);
        System.out.println("Círculo:");
        System.out.println("Área: " + miCirculo.calcularArea());
        System.out.println("Perímetro: " + miCirculo.calcularPerimetro());

        // Crear un objeto de tipo Rectángulo con base 4.0 y altura 3.0
        Rectangulo miRectangulo = new Rectangulo(4.0, 3.0);
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + miRectangulo.calcularArea());
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());
    }

}
