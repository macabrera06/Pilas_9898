import java.util.ArrayList;
import java.util.List;

public class ListaEjemplo {
    public static void main(String[] args) {
        // Declaración e inicialización de una lista de enteros
        List<Integer> numeros = new ArrayList<>();

        // Agregar elementos a la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acceder a un elemento de la lista
        int primerElemento = numeros.get(0);
        System.out.println("Primer elemento: " + primerElemento);

        // Modificar un elemento de la lista
        numeros.set(1, 25);

        // Iterar sobre los elementos de la lista
        System.out.println("Elementos de la lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Verificar si un elemento está en la lista
        boolean contieneTreinta = numeros.contains(30);
        System.out.println("¿Contiene el número 30? " + contieneTreinta);

        // Obtener el tamaño de la lista
        int tamano = numeros.size();
        System.out.println("Tamaño de la lista: " + tamano);

        // Eliminar un elemento de la lista
        numeros.remove(0);
        System.out.println("Elementos de la lista después de eliminar el primer elemento:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Vaciar la lista
        numeros.clear();
        System.out.println("Elementos de la lista después de vaciarla: " + numeros);
    }
}
