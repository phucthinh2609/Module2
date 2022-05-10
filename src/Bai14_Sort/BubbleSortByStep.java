package Bai14_Sort;

import java.util.Arrays;

public class BubbleSortByStep {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a size: ");
//        int size = input.nextInt();
//        int[] array = new int[size];
//
//        for(int i=0; i<array.length -1; i++){
//            System.out.println("Input element at "+ i);
//            array[i] = input.nextInt();
//        }
//
//        System.out.println(Arrays.toString(array));

        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSortByStep(array);

    }

    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        for(int i=1; i< array.length && needNextPass; i++){
            needNextPass = false;
            for (int j=0; j < array.length-i; j++){
                if (array[j] > array[j+1]){
                    System.out.println("Swap "+array[j]+" with "+array[j+1]);
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    needNextPass = true;
                }
            }
            if(needNextPass == false){
                System.out.println("May be array is sorted and next pass not needed");
                break;
            }
            System.out.println("Array after the sort "+i+" time = " + Arrays.toString(array));
        }
    }
}
