package Bai11_Stack_Queues.Generic;

public class Main {
    public static void main(String[] args) {
        Controller<String> list = new Controller<>();
        list.add("A1");
        list.add("A2");

        System.out.println(list.get(0));
        
    }
}
