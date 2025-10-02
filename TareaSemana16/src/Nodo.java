
// Clase Nodo.java
public class Nodo {
    private String id;  // identificador único del nodo
    
    public Nodo(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return id;
    }
}
