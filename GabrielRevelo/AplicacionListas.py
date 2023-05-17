# Creamos la clase node
class node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class AplicacionDeListasEnlazadas:
    def __init__(self):
        self.head = None

    # Método para agregar elementos en el frente de la linked list
    def add_at_front(self, data):
        self.head = node(data=data, next=self.head)

    # Método para agregar un nuevo nodo entre dos ya existentes
    def add_between(self, posicion, elemento):
        curr = self.head
        count = 1
        nodoPrevio = None

        if elemento > 0:

            while count != posicion:
                nodoPrevio = curr
                curr = curr.next
                count += 1

            if nodoPrevio is None:
                self.head = curr.next

            elif curr:
                nodoPrevio.next = node(data=elemento, next=curr)

        else:
            return False

    # Método para agregar elementos al final de la linked list
    def add_at_end(self, data):
        if not self.head:
            self.head = node(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(data=data)

    # Método para verificar si la estructura de datos esta vacia
    def is_empty(self):
        return self.head == None

    # Método para imprimir la lista de nodos
    def print_list(self):
        node = self.head

        while node != None:
            print(node.data, end=" => ")
            node = node.next


s = AplicacionDeListasEnlazadas()  # Instancia de la clase
s.add_at_front(-5)  # Agregamos un elemento al frente del nodo
s.add_at_end(8)  # Agregamos un elemento al final del nodo
s.add_at_front(-9)  # Agregamos otro elemento al frente del nodo

s.add_between(2, -3)  # Insertamos un nuevo elemento (3) en la posicion (2)
s.print_list()  # Imprimimos la lista de nodos
