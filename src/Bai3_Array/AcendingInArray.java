package Bai3_Array;
import java.util.Scanner;

public class AcendingInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array;
        int i = 0;
        int temp;
        int count;


        do{
            System.out.println("-----------------------------");
            System.out.println("Count of array: ");
            count = input.nextInt();
            if(count>20 || count<=0){
                System.out.println("A count of array is invalid!!!");
            }
        }while(count>20 || count<=0);

        array = new int[count];

        while(i<array.length){
            System.out.println("Enter a element in array at "+i+": ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.print("Elements in array is: ");
        for (int j=0; j<array.length; j++){
            if (j==count-1){
                System.out.print(array[j] + ". ");
                break;
            }
            System.out.print(array[j] + ", ");
        }

        for (int j = 0; j < count; j++) {
            for (int k = j + 1; k < count; k++) {
                if (array[j] > array[k]) {
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Acending array is: ");
        for (int j=0; j<array.length; j++){
            if (j==count-1){
                System.out.print(array[j] + ". ");
                break;
            }
            System.out.print(array[j] + ", ");
        }
    }
}
