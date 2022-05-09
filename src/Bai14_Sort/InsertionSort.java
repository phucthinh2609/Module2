package Bai14_Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void  insertionSort(int[] array){
        int x, pos;
        for(int i=0; i<array.length-1; i++){
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,24,5,10};
        System.out.println("Array = "+ Arrays.toString(array));
        insertionSort(array);
        System.out.println("After bubble sort Array = "+Arrays.toString(array));
    }
}
