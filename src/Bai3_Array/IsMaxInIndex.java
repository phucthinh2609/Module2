package Bai3_Array;
import java.util.Scanner;

public class IsMaxInIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array;
        int size;

        do{
            System.out.println("------------------");
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if(size>20)
                System.out.println("Size is too large!");
        }while (size>20);

        array = new int [size];
        int i = 0;

        while (i<size){
            System.out.print("Enter a element in array at index "+i+": ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.print("Elements of array is: ");
        for (int j=0; j<size; j++) {
            System.out.print(array[j] + " ");
        }

        int max = array[0];
        int index=0;


        for(int j=0; j<size; j++) {
            if(array[j]>max){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println();
        System.out.println("The largest element value in array is: "+max+", at index: "+index+" ");


    }
}
