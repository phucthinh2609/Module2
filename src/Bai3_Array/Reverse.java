package Bai3_Array;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array;
        int size;

        do{
            System.out.println("-------------------------");
            System.out.println("Enter a size of array: ");
            size = input.nextInt();
            if(size>20) System.out.println("Size is too large!");
        }while(size>20);

        array = new int[size];
        int i = 0;
        while(i<size){
            System.out.println("Element at index " + i + ": ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements of array: ", "");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }

        for (int j=0; j<array.length/2; j++){
            int temp;
            temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }

        System.out.printf("\n%-20s%s", "Elements of reverse array: ", "");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
