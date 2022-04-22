package Bai3_Array;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,2,5};
        System.out.println("Enter value what you want remove: ");
        int val_remove = input.nextInt();
        int[] newArray = new int[array.length-1];

        for(int i=0, j=0, time=0; i< array.length; i++,j++){
            if(array[i]==val_remove) {
                i++;
            }
            newArray[j] = array[i];
        }

        System.out.println("Start = " + Arrays.toString( array));
        System.out.println("End = " + Arrays.toString(newArray));

    }
}
