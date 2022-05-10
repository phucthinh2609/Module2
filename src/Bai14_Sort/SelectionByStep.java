package Bai14_Sort;

import java.util.Arrays;

public class SelectionByStep {
    public static void main(String[] args) {
        double[] array = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSortByStep(array);
    }

    public static void selectionSortByStep(double[] array){
        for (int i = 0; i < array.length - 1; i++) {
            double currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                    System.out.println("The minimum in the array["+(i+1)+".."+array.length+"] is "+currentMin+" at "+currentMinIndex+" index");
                }
            }

            if (currentMinIndex != i) {
                System.out.println("Swap "+array[i]+" with " + array[currentMinIndex]);
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
            System.out.println("List after the "+i+" time sort = " + Arrays.toString(array));
            System.out.println();
        }
    }

}
