package codechef;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList  = new CircularLinkedList();
        CircularLinkedList.Node first = new CircularLinkedList.Node(15);
        CircularLinkedList.Node second = new CircularLinkedList.Node(14);
        CircularLinkedList.Node third = new CircularLinkedList.Node(17);
        first.setNext(second);
        second.setNext(third);
    }
}
