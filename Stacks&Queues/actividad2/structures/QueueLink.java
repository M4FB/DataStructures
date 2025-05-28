package actividad2.structures;

import exceptions.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public QueueLink(){
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x){
        Node<E> aux = new Node<E>(x);
        if (this.isEmpty()){
            this.first = aux;
        } else {
            this.last.setNext(aux);
        }
        this.last = aux;
    }
    
    public E dequeue() throws ExceptionIsEmpty{
        if (this.isEmpty()){
            throw new ExceptionIsEmpty("La cola esta vacía");
        }
        E elemento = this.first.getData();
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null;
        }
        return elemento;
    }

    public E back() throws ExceptionIsEmpty{
        if (this.isEmpty()){
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return this.last.getData();
    }

    public E front() throws ExceptionIsEmpty{
        if (this.isEmpty()){
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return this.first.getData();
    }

    public boolean isEmpty() {
        return this.first == null;
    }


}
