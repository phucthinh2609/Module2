package Bai11_Stack_Queues;

import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("A1");
        queue.offer("A2");
        queue.offer("A3");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Stack<String> stack = new Stack<>();
        stack.add("A1");
        stack.add("A2");
        stack.add("A3");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
