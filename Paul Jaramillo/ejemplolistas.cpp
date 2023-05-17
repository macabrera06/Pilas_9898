#include <iostream>
//Este ejemplo implementa una lista doblemente enlazada con dos funciones para insertar
//nodos al inicio y al final de la lista. La función imprimirLista se utiliza para mostrar
//los elementos de la lista. En el main, se crean algunos nodos y se insertan en la lista,
//luego se imprime el contenido de la lista.
struct Nodo {
    int dato;
    Nodo* siguiente;
    Nodo* anterior;
};

class ListaDoble {
private:
    Nodo* primero;
    Nodo* ultimo;

public:
    ListaDoble() {
        primero = nullptr;
        ultimo = nullptr;
    }

    void insertarAlInicio(int dato) {
        Nodo* nuevoNodo = new Nodo;
        nuevoNodo->dato = dato;
        nuevoNodo->siguiente = nullptr;

        if (primero == nullptr) {
            nuevoNodo->anterior = nullptr;
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo->anterior = nullptr;
            nuevoNodo->siguiente = primero;
            primero->anterior = nuevoNodo;
            primero = nuevoNodo;
        }
    }

    void insertarAlFinal(int dato) {
        Nodo* nuevoNodo = new Nodo;
        nuevoNodo->dato = dato;
        nuevoNodo->siguiente = nullptr;

        if (ultimo == nullptr) {
            nuevoNodo->anterior = nullptr;
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo->anterior = ultimo;
            ultimo->siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
    }

    void imprimirLista() {
        Nodo* actual = primero;

        while (actual != nullptr) {
            std::cout << actual->dato << " ";
            actual = actual->siguiente;
        }

        std::cout << std::endl;
    }
};

int main() {
    ListaDoble lista;

    lista.insertarAlInicio(10);
    lista.insertarAlFinal(20);
    lista.insertarAlFinal(30);
    lista.insertarAlInicio(5);

    lista.imprimirLista();

    return 0;
}

