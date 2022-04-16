package Bai3_Array;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int n1 = array1.length;
        int n2 = array2.length;
        int[] newArray = new int[n1+n2];

        for (int i=0; i<n1; i++){
            newArray[i] = array1[i];
        }

        for(int i=n1, j=0; i< newArray.length; i++, j++){
            newArray[i] = array2[j];
        }

        System.out.println("Array 3 is: " + Arrays.toString(newArray));
    }
}
