package Bai3_Array;
import java.util.Scanner;

public class Celsisus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        double result;
        int choice = -1;


        while(choice!=0){
            System.out.println("-----------------------------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    result = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println("Celsius = " + result + " (C)");
                case 2:
                    System.out.println("Enter your Celsius: ");
                    celsius = input.nextDouble();
                    result = celsius * 9/5 + 32;
                    System.out.println("Fahrenheit = " + result + " (F)");
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid!!");
            }
        }








    }
}
