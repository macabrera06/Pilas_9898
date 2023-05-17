import java.util.EmptyStackException;

public class Pila {

    private Nodo cima; // Nodo que representa la cima de la pila

    private class Nodo {
        private Object dato;
        private Nodo siguiente;

        public Nodo(Object dato, Nodo siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Inserta un elemento en la cima de la pila
    public void apilar(Object elemento) {
        Nodo nuevoNodo = new Nodo(elemento, cima);
        cima = nuevoNodo;
    }

    // Elimina y retorna el elemento en la cima de la pila
    public Object desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        Object elemento = cima.dato;
        cima = cima.siguiente;
        return elemento;
    }

    // Retorna el elemento en la cima de la pila sin eliminarlo
    public Object cima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        return cima.dato;
    }

    // Retorna el tamaño de la pila
    public int tamaño() {
        int tamaño = 0;
        Nodo actual = cima;

        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }

        return tamaño;
    }
}
