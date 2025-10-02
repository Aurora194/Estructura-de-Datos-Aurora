

// Clase Main.java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        
        // Crear nodos
        Nodo a = new Nodo("A");
        Nodo b = new Nodo("B");
        Nodo c = new Nodo("C");
        Nodo d = new Nodo("D");
        Nodo e = new Nodo("E");
        
        // Agregar nodos al grafo
        g.agregarNodo(a);
        g.agregarNodo(b);
        g.agregarNodo(c);
        g.agregarNodo(d);
        g.agregarNodo(e);
        
        // Crear conexiones
        g.agregarArista(a, b);
        g.agregarArista(a, c);
        g.agregarArista(b, d);
        g.agregarArista(c, d);
        g.agregarArista(d, e);
        
        // Mostrar estructura del grafo
        g.mostrarGrafo();
        
        // Calcular y reportar centralidades
        System.out.println("\n=== CENTRALIDAD DE GRADO ===");
        System.out.println(Centralidades.centralidadGrado(g));
        
        System.out.println("\n=== CENTRALIDAD DE CERCANÍA ===");
        System.out.println(Centralidades.centralidadCercania(g));
        
        System.out.println("\n=== CENTRALIDAD DE INTERMEDIACIÓN ===");
        System.out.println(Centralidades.centralidadIntermediacion(g));
    }
}
