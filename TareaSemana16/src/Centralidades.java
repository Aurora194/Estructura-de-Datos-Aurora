
// Clase Centralidades.java
import java.util.*;

public class Centralidades {
    
    // Centralidad de Grado
    public static Map<Nodo, Integer> centralidadGrado(Grafo g) {
        Map<Nodo, Integer> grados = new HashMap<>();
        for (Nodo n : g.obtenerNodos()) {
            grados.put(n, g.obtenerVecinos(n).size());
        }
        return grados;
    }

    // Centralidad de Cercanía
    public static Map<Nodo, Double> centralidadCercania(Grafo g) {
        Map<Nodo, Double> cercania = new HashMap<>();
        for (Nodo n : g.obtenerNodos()) {
            Map<Nodo, Integer> distancias = bfs(g, n);
            double suma = 0;
            for (int d : distancias.values()) {
                suma += d;
            }
            cercania.put(n, 1.0 / suma);
        }
        return cercania;
    }

    // Centralidad de Intermediación (simplificada)
    public static Map<Nodo, Integer> centralidadIntermediacion(Grafo g) {
        Map<Nodo, Integer> intermediacion = new HashMap<>();
        for (Nodo n : g.obtenerNodos()) {
            intermediacion.put(n, 0);
        }
        
        List<Nodo> nodos = new ArrayList<>(g.obtenerNodos());
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = i+1; j < nodos.size(); j++) {
                List<Nodo> camino = caminoMasCorto(g, nodos.get(i), nodos.get(j));
                if (camino != null) {
                    for (Nodo intermedio : camino) {
                        if (!intermedio.equals(nodos.get(i)) && !intermedio.equals(nodos.get(j))) {
                            intermediacion.put(intermedio, intermediacion.get(intermedio) + 1);
                        }
                    }
                }
            }
        }
        return intermediacion;
    }
    
    // Algoritmo BFS para distancias
    private static Map<Nodo, Integer> bfs(Grafo g, Nodo inicio) {
        Map<Nodo, Integer> dist = new HashMap<>();
        Queue<Nodo> cola = new LinkedList<>();
        
        for (Nodo n : g.obtenerNodos()) {
            dist.put(n, Integer.MAX_VALUE);
        }
        dist.put(inicio, 0);
        cola.add(inicio);
        
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            for (Nodo vecino : g.obtenerVecinos(actual)) {
                if (dist.get(vecino) == Integer.MAX_VALUE) {
                    dist.put(vecino, dist.get(actual) + 1);
                    cola.add(vecino);
                }
            }
        }
        return dist;
    }
    
    // Camino más corto (BFS simple)
    private static List<Nodo> caminoMasCorto(Grafo g, Nodo origen, Nodo destino) {
        Map<Nodo, Nodo> predecesor = new HashMap<>();
        Queue<Nodo> cola = new LinkedList<>();
        Set<Nodo> visitados = new HashSet<>();
        
        cola.add(origen);
        visitados.add(origen);
        
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            if (actual.equals(destino)) {
                List<Nodo> camino = new ArrayList<>();
                for (Nodo at = destino; at != null; at = predecesor.get(at)) {
                    camino.add(at);
                }
                Collections.reverse(camino);
                return camino;
            }
            for (Nodo vecino : g.obtenerVecinos(actual)) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    predecesor.put(vecino, actual);
                    cola.add(vecino);
                }
            }
        }
        return null;
    }
}
