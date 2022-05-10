package Bai15_Debug_Exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.creatRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nEnter a random index: ");
        int index = input.nextInt();
        try{
            System.out.println("Element "+array[index]+" at index " + index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of array bounds!!!");
        }
    }

    public Integer[] creatRandom(){
        Random random = new Random();
        Integer[] array = new Integer[100];

        System.out.print("Array = [ ");
        for (int i=0; i< array.length-1; i++ ){
            array[i] = random.nextInt(100);
            System.out.print(array[i] +" ");
        }
        System.out.print("]");
        return array;
    }
}
