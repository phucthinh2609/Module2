package Bai3_Array;
import java.util.Scanner;
import java.util.Arrays;

public class AddAElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0};
        int value_add;
        int index_add;


        System.out.println("Enter a value which you want add to array: ");
        value_add = input.nextInt();

        do {
            System.out.println("Enter a index of value which you want add to array: ");
            index_add = input.nextInt();

            if(index_add<=-1 || index_add>= array.length-1){
                System.out.println("=============================");
                System.out.println("Can't add the value to array. Please enter a index again!!!");
            }
        }while (index_add<=-1 || index_add>= array.length-1);

        int[] newArray = new int [array.length + 1];
        int j = 0;

        for(int i = 0; i<newArray.length; i++) {
            if(i==index_add) {
                newArray[i] = value_add;
            }else {
                newArray[i] = array[j];
                j++;
            }
        }

        System.out.println("Added array is: "+ Arrays.toString(newArray));
    }
}
