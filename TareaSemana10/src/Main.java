import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // 1. Conjunto universal de 500 ciudadanos
        Set<String> ciudadanos = Vacunacion.generarCiudadanos(500);

        // 2. Conjuntos de vacunados
        Set<String> pfizer = Vacunacion.generarVacunados(ciudadanos, 75, 3); // cada 3ro
        Set<String> astrazeneca = Vacunacion.generarVacunados(ciudadanos, 75, 5); // cada 5to

        // 3. Listados solicitados

        // Ciudadanos que no se han vacunado: U - (Pfizer ∪ AstraZeneca)
        Set<String> noVacunados = Vacunacion.diferencia(ciudadanos, Vacunacion.union(pfizer, astrazeneca));

        // Ciudadanos que han recibido ambas dosis: Pfizer ∩ AstraZeneca
        Set<String> ambasDosis = Vacunacion.interseccion(pfizer, astrazeneca);

        // Ciudadanos que solo recibieron Pfizer: Pfizer - AstraZeneca
        Set<String> soloPfizer = Vacunacion.diferencia(pfizer, astrazeneca);

        // Ciudadanos que solo recibieron AstraZeneca: AstraZeneca - Pfizer
        Set<String> soloAstra = Vacunacion.diferencia(astrazeneca, pfizer);

        // 4. Imprimir resultados
        System.out.println("=== RESULTADOS DE LA CAMPAÑA DE VACUNACIÓN ===");
        System.out.println("Total de ciudadanos: " + ciudadanos.size());
        System.out.println("Vacunados Pfizer: " + pfizer.size());
        System.out.println("Vacunados AstraZeneca: " + astrazeneca.size());
        System.out.println();

        System.out.println("No vacunados: " + noVacunados.size());
        System.out.println(noVacunados);
        System.out.println();

        System.out.println("Ambas dosis (Pfizer + AstraZeneca): " + ambasDosis.size());
        System.out.println(ambasDosis);
        System.out.println();

        System.out.println("Solo Pfizer: " + soloPfizer.size());
        System.out.println(soloPfizer);
        System.out.println();

        System.out.println("Solo AstraZeneca: " + soloAstra.size());
        System.out.println(soloAstra);
    }
}
