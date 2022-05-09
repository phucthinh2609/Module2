package Bai13_Search.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] list, int target){
        for (int i =0; i<list.length; i++){
            if (list[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = input.nextInt();
        int[] list = new int[size];
        for(int i=0; i<list.length; i++){
            System.out.println("Enter element at index: " + i);
            list[i] = input.nextInt();
        }

        System.out.println("Enter a target");
        int target = input.nextInt();

        int result  = linearSearch(list, target);
        if(result != -1)
            System.out.println("Element found at: "+ result);
        else
            System.out.println("Element not found");

        System.out.println("List = "+Arrays.toString(list));
    }
}
