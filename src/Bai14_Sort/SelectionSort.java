package Bai14_Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void  selectionSort(int[] array){
        for(int i=0; i<array.length -1; i++){
            int min = i;
            for(int j=i+1; j<array.length -1; j++){
                if(array[j] < array[min])
                    min = j;
            }
            if(min!=i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("Array = "+ Arrays.toString(array));
        selectionSort(array);
        System.out.println("After bubble sort Array = "+Arrays.toString(array));
    }
}
