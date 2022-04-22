package Bai3_Array;
import java.util.Arrays;

public class Selection_Sort {
    public static int[] selection_sort(int[] array){
        for(int i=0; i<array.length; i++){
            int minArray = i;
            for (int j=i+1; j<array.length; j++){
                if(array[j]<array[minArray]){
                    minArray = j;
                }
            }
            int temp = array[i];
            array[i] = array[minArray];
            array[minArray] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {12,-5,0,50,-50};

        System.out.println("Begin array: "+ Arrays.toString(array));
        selection_sort(array);
        System.out.println("After array: "+ Arrays.toString(array));

    }
}
