
// Clase principal para probar las figuras
package Main;

import Clases.Circulo;
import Clases.Rectangulo;

public class FigurasGeometricas {


    public static void main(String[] args) {
        // Generar una instancia de la clase Circulo con un valor de radio 7
        Circulo circulo = new Circulo(7);

        // Mostrar resultados del círculo
        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.CalcularArea());
        System.out.println("Perímetro: " + circulo.CalcularPerimetro());

        // Formar un objeto de la clase Rectángulo con una base de 3 y una altura de 8
        Rectangulo miRectangulo = new Rectangulo(3, 8);

        // Mostrar resultados del rectángulo
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + miRectangulo.CalcularArea());
        System.out.println("Perímetro: " + miRectangulo.CalcularPerimetro());
    }


}

