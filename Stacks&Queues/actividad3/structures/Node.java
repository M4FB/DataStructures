package actividad3.structures;

public class Node<T> {
    public T data;
    public Node<T> nextNode;

    public Node(T data){
        this.data = data;
        this.nextNode = null;
    }

    public void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    public Node<T> getNext() {
        return nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
