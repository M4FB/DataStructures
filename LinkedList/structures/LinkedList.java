package structures;

/**
 * Node -> Representa a un nodo de la lista enlazada
 * 
 * @param <T> El tipo de dato almacenado en este nodo.
 */

class Node <T>{
    public T data; // El dato que almacena el nodo
    public Node<T> nextNode; // La referencia al siguiente nodo en la lista enlazada

    public Node(T data){
        this.data = data;
        this.nextNode = null;
    }
}

/**
 * LinkedList -> Representa una lista enlazada generica.
 * 
 * @param <T> El tipo de dato almacenado en este nodo.
 * 
 * Esta clase representa las operaciones más basicas para una lista enlazada como:
 * - Insertar elementos al inicio o al final de la lista
 * - Eliminar elementos segun su valor
 * - Buscar elementos segun su valor
 * - Imprimir toda la lista
 * - Verificar si la lista esta vacia
 * - Obtener la longitud de la lista
 * - Destruir la lista
 */

public class LinkedList <T> {
    private Node<T> firstNode;

    public LinkedList(){
        this.firstNode = null;
    }

    public void setFirstNode(Node<T> firstNode) {
        this.firstNode = firstNode;
    }

    public boolean isEmptyList(){
        return firstNode == null;
    }

    public int lengthList(){
        int count = 0;
        Node<T> currentNode = firstNode;

        while (currentNode != null){
            count++;
            currentNode = currentNode.nextNode;
        }
        return count;
    }

    public void destroyList(){
        firstNode = null;
    }

    public int search(T dataToSearch){
        int pos = 0;
        Node<T> currentNode = firstNode;

        while (currentNode != null){
            if (currentNode.data.equals(dataToSearch) ){
                return pos;
            }
            currentNode = currentNode.nextNode;
            pos++;
        }
        return -1;
    }

    public void insertFirst(T data){
        Node<T> newNode = new Node<>(data);

        if (firstNode == null){
            firstNode = newNode;
        } else {
            newNode.nextNode = firstNode;
            firstNode = newNode;            
        }
    }

    public void insertLast(T data) {
        Node<T> newNode = new Node<>(data);
    
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            Node<T> currentNode = firstNode;

            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
        }
    }

    public void removeNode(T data){

        if (firstNode == null){
            System.out.println("La lista esta vacia");
            return;
        }

        if (firstNode.data.equals(data)) {
            firstNode = firstNode.nextNode;
            return;
        }

        //manejo de el resto de la lista
        Node<T> currentNode = firstNode;

        while (currentNode.nextNode != null){
            if (currentNode.nextNode.data.equals(data)) {
                currentNode.nextNode = currentNode.nextNode.nextNode;
                return;
            }
            currentNode = currentNode.nextNode;
        }
        System.out.println("No se encontro el elemento en la lista");
    }
    

    public void printList(){
        Node<T> currentNode = firstNode;

        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.nextNode;
        }
        System.out.print("null");        
    }




    // public void removeConcurrentEqual(){
    //     Node<T> currentNode = firstNode;
    //     while (currentNode != null){
    //         if (currentNode.data.equals(currentNode.nextNode.data)){
    //             currentNode.nextNode = currentNode.nextNode.nextNode;
    //         }
    //         currentNode = currentNode.nextNode;
    //     }

    // }



}
