package Bai11_Stack_Queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseIntegerArrayByStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size: ");
        int size = input.nextInt();

        int[] array = new int[3];

        for (int i=0; i<array.length; i++){
            array[i] = (int) Math.floor(Math.random()*100+1);
            stack.push(array[i]);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println("\nAfter reserved");

        System.out.println(Arrays.toString(array));


        LinkedList<Character> wStack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string: ");
        String mWord = scanner.nextLine();

        System.out.println(mWord);

        for(int i=0; i<mWord.length(); i++){
            wStack.push(mWord.charAt(i));
        }

        String outp ="";

        for(int i=0; i<mWord.length(); i++){
            outp += wStack.pop();
        }
        System.out.println("\nAfter reserved");
        System.out.println(outp);
    }
}
