
// Clase ArbolBinario.java
// Implementa las operaciones principales sobre un árbol binario
public class ArbolBinario {
    private Nodo raiz; // Nodo raíz del árbol

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un nuevo nodo en el árbol
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return new Nodo(dato);
        }
        if (dato < actual.dato) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, dato);
        } else if (dato > actual.dato) {
            actual.derecho = insertarRecursivo(actual.derecho, dato);
        }
        return actual;
    }

    // Buscar un elemento en el árbol
    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    private boolean buscarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return false;
        }
        if (dato == actual.dato) {
            return true;
        }
        return dato < actual.dato
                ? buscarRecursivo(actual.izquierdo, dato)
                : buscarRecursivo(actual.derecho, dato);
    }

    // Recorrido Inorden
    public void inOrden() {
        inOrdenRecursivo(raiz);
        System.out.println();
    }

    private void inOrdenRecursivo(Nodo actual) {
        if (actual != null) {
            inOrdenRecursivo(actual.izquierdo);
            System.out.print(actual.dato + " ");
            inOrdenRecursivo(actual.derecho);
        }
    }

    // Recorrido Preorden
    public void preOrden() {
        preOrdenRecursivo(raiz);
        System.out.println();
    }

    private void preOrdenRecursivo(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.dato + " ");
            preOrdenRecursivo(actual.izquierdo);
            preOrdenRecursivo(actual.derecho);
        }
    }

    // Recorrido Postorden
    public void postOrden() {
        postOrdenRecursivo(raiz);
        System.out.println();
    }

    private void postOrdenRecursivo(Nodo actual) {
        if (actual != null) {
            postOrdenRecursivo(actual.izquierdo);
            postOrdenRecursivo(actual.derecho);
            System.out.print(actual.dato + " ");
        }
    }

    // Eliminar un nodo del árbol
    public void eliminar(int dato) {
        raiz = eliminarRecursivo(raiz, dato);
    }

    private Nodo eliminarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return null;
        }

        if (dato < actual.dato) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, dato);
        } else if (dato > actual.dato) {
            actual.derecho = eliminarRecursivo(actual.derecho, dato);
        } else {
            // Caso 1: nodo sin hijos
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }
            // Caso 2: un solo hijo
            else if (actual.izquierdo == null) {
                return actual.derecho;
            } else if (actual.derecho == null) {
                return actual.izquierdo;
            }
            // Caso 3: dos hijos -> buscar sucesor
            actual.dato = encontrarMin(actual.derecho).dato;
            actual.derecho = eliminarRecursivo(actual.derecho, actual.dato);
        }
        return actual;
    }

    private Nodo encontrarMin(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }
}
