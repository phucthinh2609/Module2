package Bai3_Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
//      Make Array
        int[][] array = new int[3][3];
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = random.nextInt(11);
            }
        }
        System.out.println("Array = " + Arrays.deepToString(array));
//      Input column
        int input_column;
        do {
            System.out.println("Enter a column: ");
            input_column = input.nextInt();
            if((input_column<0 || input_column>=3)){
                System.out.println("\nColumn is invalid!! Try again");
            }
        }while(input_column<0 || input_column>=3);
//      Get Sum of Value In Column
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i][input_column];
        }
        System.out.println("Sum of value in column "+input_column+" is: " + sum);

    }

}
