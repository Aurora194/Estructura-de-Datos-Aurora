
// Clase principal para probar las figuras
package Main;

import Clases.Circulo;
import Clases.Rectangulo;

public class FigurasGeometricas {


    public static void main(String[] args) {
        // Crear un objeto de la clase Circulo con radio 7
        Circulo miCirculo = new Circulo(7);

        // Mostrar resultados del círculo
        System.out.println("Círculo:");
        System.out.println("Área: " + miCirculo.calcularArea());
        System.out.println("Perímetro: " + miCirculo.calcularPerimetro());

        // Crear un objeto de la clase Rectangulo con base 4 y altura 8
        Rectangulo miRectangulo = new Rectangulo(4, 8);

        // Mostrar resultados del rectángulo
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + miRectangulo.calcularArea());
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());
    }


}

