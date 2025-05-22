class Node <T>{
    public T data;
    public Node<T> nextNode;

    public Node(T data){
        this.data = data;
        this.nextNode = null;
    }
}



public class LinkedList <T> {
    private Node<T> firstNode;

    public LinkedList(Node<T> firstNode){
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
}
