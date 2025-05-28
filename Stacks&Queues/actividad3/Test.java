package actividad3;

import actividad3.structures.PriorityQueueLinkSort;

public class Test {
    public static void main(String[] args) {
    try {
        PriorityQueueLinkSort<String, Integer> pq = new PriorityQueueLinkSort<>();

        pq.enqueue("A", 2);
        pq.enqueue("B", 5);
        pq.enqueue("C", 3);

        System.out.println(pq); 

        System.out.println("Front: " + pq.front()); 
        System.out.println("Back: " + pq.back());   

        System.out.println("Dequeue: " + pq.dequeue()); 
        System.out.println(pq); 

        System.out.println("Is Empty: " + pq.isEmpty()); 
        pq.dequeue();
        pq.dequeue();
        System.out.println("Is Empty: " + pq.isEmpty());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
