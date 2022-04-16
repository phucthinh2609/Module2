package Bai3_Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];

        int input_element;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println("Enter element at index ["+i+"]["+j+"]");
                input_element = input.nextInt();
                array[i][j] = input_element;
            }
        }
        System.out.println("Array = " + Arrays.deepToString(array));

        int sum = array[0][0];
        for(int i=1, j=1; i<array.length; i++, j++){
            sum += array[i][j];
        }
        System.out.println("Sum of Diagonal Line is: "+ sum);
    }
}
