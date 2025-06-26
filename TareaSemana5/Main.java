/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in); // Un solo scanner para toda la aplicación

        // --- Ejercicio 1: Lotería Primitiva ---
        System.out.println("\n--- Ejercicio 1: Lotería Primitiva ---");
        LoteriaPrimitiva loteria = new LoteriaPrimitiva(); // Crea una instancia de LoteriaPrimitiva
        loteria.pedirNumeros(); // Pide los números al usuario
        loteria.ordenarNumeros(); // Ordena los números
        loteria.mostrarNumeros(); // Muestra los números ordenados

        // --- Ejercicio 2: Números Inversos ---
        System.out.println("\n--- Ejercicio 2: Números Inversos ---");
        NumerosInversos numerosInv = new NumerosInversos(); // Crea una instancia de NumerosInversos
        numerosInv.mostrarNumerosInversos(); // Muestra los números en orden inverso

        // --- Ejercicio 3: Abecedario Filtrado ---
        System.out.println("\n--- Ejercicio 3: Abecedario Filtrado ---");
        Abecedario abecedario = new Abecedario(); // Crea una instancia de Abecedario
        abecedario.filtrarAbecedario(); // Filtra el abecedario
        abecedario.mostrarAbecedario(); // Muestra el abecedario resultante

        // --- Ejercicio 4: Asignaturas a Repetir ---
        System.out.println("\n--- Ejercicio 4: Asignaturas a Repetir ---");
        ControlAsignaturas controlAsig = new ControlAsignaturas(); // Crea una instancia de ControlAsignaturas
        controlAsig.procesarNotas(); // Procesa las notas de las asignaturas
        controlAsig.mostrarAsignaturasARepetir(); // Muestra las asignaturas a repetir

        // --- Ejercicio 5: Conteo de Vocales ---
        System.out.println("\n--- Ejercicio 5: Conteo de Vocales ---");
        ContadorVocales contadorVoc = new ContadorVocales(); // Crea una instancia de ContadorVocales
        contadorVoc.pedirPalabra(); // Pide la palabra al usuario
        contadorVoc.contarVocales(); // Cuenta las vocales
        contadorVoc.mostrarConteoVocales(); // Muestra el conteo de vocales

        mainScanner.close(); // Cierra el scanner al finalizar todas las operaciones
        System.out.println("\n--- Fin de la ejecución de todos los ejercicios ---");
    }
}