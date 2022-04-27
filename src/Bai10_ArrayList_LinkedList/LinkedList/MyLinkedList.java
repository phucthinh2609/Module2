package Bai10_ArrayList_LinkedList.LinkedList;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for(int i=0; i<index-1 && temp == null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("===TESTING====");
        MyLinkedList myLinkedList = new MyLinkedList(15);

        myLinkedList.addFirst(12);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(9);


        myLinkedList.add(0,11);

        myLinkedList.printList();

    }
}
