package Bai3_Array;
import java.util.Scanner;

public class PassingExamStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if(size<1 || size>30) System.out.println("\nSize is invalid!! Try again");
        }while(size<1 || size>30);

        int[] array = new int[size];
        int count = 0;

        for (int i=0; i<array.length; i++){
            System.out.println("Enter a mark of student "+(i+1));
            array[i] = input.nextInt();
            if(array[i]>=5) count++;
        }

        System.out.println("The number of students pass in the exam is: " + count   );

    }
}
