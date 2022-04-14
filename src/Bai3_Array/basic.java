package Bai3_Array;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        double [][] array;
        double total = 0;

        array = new double[3][2];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.println("Nhap phan tu thu ["+i+"]["+j+"]");
                array[i][j] = scanner.nextDouble();
                total += array[i][j];
            }
        }
        System.out.println("Total = " + total);
    }
}