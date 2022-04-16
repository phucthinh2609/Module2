package Bai3_Array;
import java.util.Random;
import java.util.Arrays;

public class IsMaxIn2DimensionalArrays {
    public static void main(String[] args) {
        Random random = new Random(21);
        int[][] array = new int[3][3];

        for (int i=0; i<array.length; i++){
            for (int j=0; j< array[i].length; j++){
                array[i][j] = random.nextInt(101);
            }
        }
        System.out.println("Array = "+Arrays.deepToString(array));

        int max = array[0][0];
        int index_1 = 0;
        int index_2 = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j< array[i].length; j++){
                 if (array[i][j] > max){
                     max = array[i][j];
                     index_1 = i;
                     index_2 = j;
                 }
            }
        }
        System.out.println("The largest element is "+max+", at index ["+index_1+"]["+index_2+"] ");
    }
}
