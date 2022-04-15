package Bai3_Array;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveAElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        System.out.println("Enter a element which you want remove: ");
        int value_del = input.nextInt();
        int index_del = 0;

        for (int i=1; i<array.length;i++){
            if (array[i] == value_del){
                index_del = i;
            }
        }

        for (int i=index_del; i<array.length -1; i++){
            array[i] = array[i+1];
        }
        System.out.println("Array after removing is: "+ Arrays.toString(array));

    }
}
