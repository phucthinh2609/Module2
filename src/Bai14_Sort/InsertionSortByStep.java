package Bai14_Sort;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void  insertionSortByStep(int[] array){
        int x, pos;
        for(int i=0; i<array.length-1; i++){
            x = array[i];
            pos = i;
            System.out.println("X = "+array[i] + " at "+i+" index");
            while (pos > 0 && x < array[pos-1]){
                System.out.println("Swap "+array[pos]+" with " + array[pos-1]);
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
            System.out.println("Array after the sort "+i+" time = " + Arrays.toString(array));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("Array = "+ Arrays.toString(array));
        insertionSortByStep(array);
//        System.out.println("After bubble sort Array = "+Arrays.toString(array));
    }
}
