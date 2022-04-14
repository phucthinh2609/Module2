package Bai3_Array;

public class printArray {
    public static void main(String[] args) {
        printAArray(new int []{1,2,3,4,});
    }

    public static void printAArray(int []array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i] + "");
        }
    }
}
