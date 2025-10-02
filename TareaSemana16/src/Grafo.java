
// Clase Grafo.java
import java.util.*;

public class Grafo {
    private Map<Nodo, List<Nodo>> adyacencias;
    
    public Grafo() {
        adyacencias = new HashMap<>();
    }
    
    // Agregar nodo
    public void agregarNodo(Nodo n) {
        adyacencias.putIfAbsent(n, new ArrayList<>());
    }
    
    // Agregar arista no dirigida
    public void agregarArista(Nodo origen, Nodo destino) {
        adyacencias.get(origen).add(destino);
        adyacencias.get(destino).add(origen);
    }
    
    // Obtener vecinos
    public List<Nodo> obtenerVecinos(Nodo n) {
        return adyacencias.get(n);
    }
    
    // Reporte de grafo
    public void mostrarGrafo() {
        System.out.println("=== REPORTE DEL GRAFO ===");
        for (Nodo n : adyacencias.keySet()) {
            System.out.println("Nodo " + n + " conectado con: " + adyacencias.get(n));
        }
    }
    
    public Set<Nodo> obtenerNodos() {
        return adyacencias.keySet();
    }
}
