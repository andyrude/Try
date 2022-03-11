package codechef;

public class CircularLinkedList {
    private Node tail;
    private int size;

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }

    public void display(){
        if(tail==null){
            return;
        }
        Node first = tail.getNext();
        while (first!=tail){
            System.out.println(first.data+"-->");
            first = first.getNext();
        }
    }

    public void insertFirst(int data){
        Node temp = new Node(data);
        if(tail == null){
            tail = temp;
        }else{
            temp.setNext(tail.getNext());
        }
        tail.setNext(temp.getNext());
        size++;
    }


    public void insertLast(int data){
        Node temp = new Node(data);
        if( tail == null){
           tail = temp;
           tail.setNext(tail);
        }else{
            temp.setNext(tail.getNext());
            tail = temp;
           }
    }



    static class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
