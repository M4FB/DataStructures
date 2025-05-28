package actividad3.structures;

import exceptions.ExceptionIsEmpty;

public class PriorityQueueLinkSort<E,N> implements PriorityQueue<E,N> {

    class EntryNode{
        E data;
        N priority;
        EntryNode(E data, N priority){
            this.data = data;
            this.priority = priority;
        }
    }

    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort(){
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x, N pr){
        EntryNode newEntry = new EntryNode(x,pr);
        Node<EntryNode> newNode = new Node<>(newEntry);
        
        //Caso 1: Cola vacia
        if (this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            return;
        }

        //Caso 2: El nuevo nodo tiene mayor prioridad que el primer nodo
        if (comparePriority(pr,this.first.getData().priority) > 0){
            newNode.setNext(this.first);
            this.first = newNode;
            return;
        }
        
        //Caso 3: Insertar en el medio o al final
        Node<EntryNode> current = this.first;
        while (current.getNext() != null && comparePriority(pr, current.getNext().getData().priority) <= 0){
            current = current.getNext();
        }

        //Insercion 
        newNode.setNext(current.getNext());
        current.setNext(newNode);

        //Actualizar last si el nodo se inserta al final
        if (newNode.getNext() == null){
            this.last = newNode;
        }
    }

    //Se suprimio la alerta de el casteo
    @SuppressWarnings("unchecked") 
    private int comparePriority(N p1, N p2) {
        return ((Comparable<N>) p1).compareTo(p2);
    }
    
    public E dequeue() throws ExceptionIsEmpty{
        if (isEmpty()){
            throw new ExceptionIsEmpty("No se puede remover de una cola vacia");
        }
        E aux = this.first.getData().data;
        this.first = this.first.getNext();
        if (this.first == null){
            this.last = null;
        }
        return aux;
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()){
            throw new ExceptionIsEmpty("La cola esta vacia");
        }
        return this.last.getData().data;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()){
            throw new ExceptionIsEmpty("La cola esta vacia");
        }
        return this.last.getData().data;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    @Override
    public String toString(){
        if (this.isEmpty()){
            return "La cola está vacía.";
        }

        StringBuilder sb = new StringBuilder();
        Node<EntryNode> current = this.first;

        while (current != null) {
            EntryNode entry = current.getData();
            sb.append("[Data: ").append(entry.data)
                .append(", Priority: ").append(entry.priority)
                .append("] -> ");
            current = current.getNext();
        }

        sb.append("null");
        return sb.toString();
    }
}
