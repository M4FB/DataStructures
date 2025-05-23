public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numList = new LinkedList<>();

        System.out.println(numList.isEmptyList());

        numList.insertFirst(18);
        numList.insertFirst(22);
        numList.insertFirst(39); 
        
        System.out.println(numList.search(22));
        System.out.println(numList.search(2939));
        numList.insertLast(78);
        numList.insertLast(98);

        numList.printList();
    }
}
