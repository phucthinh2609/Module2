package Bai10_ArrayList_LinkedList.LinkedList.demoLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList list = new MyLinkedList(100);
        list.add(1, 2);
        list.add(2,"Melinda");
        list.add(3,4);
        list.addFirst(0);
        list.addLast(5);
        list.printList();
        System.out.println("Index of Melinda is: "+ list.indexOf("Melinda"));
        String text = "Melinda";
        System.out.println((list.contains(text))? text + " contained in list" : text + " not found");

        list.get(2);
    }
}
