package Bai3_Array;
import java.util.Scanner;
import java.util.Arrays;

public class AddAElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {2,3,4,5,0};
        int value_add, index_add;
        int n = array.length;

        System.out.println("Enter value which you want add: ");
        value_add = input.nextInt();
        do{

            System.out.println("Enter value which you want index: ");
            index_add = input.nextInt();
            if (index_add<0 || index_add>n)
                System.out.println("\nIndex is invalid!! Try again");
        }while(index_add<0 || index_add>n);

        int[] newArray = new int[n+1];
        int j=0;

        for (int i=0; i<newArray.length; i++){
            if(i==index_add)
                newArray[i] = value_add;
            else {
                newArray[i] = array[j];
                j++;
            }
        }

        System.out.println("Added array: " + Arrays.toString(newArray));
    }
}
