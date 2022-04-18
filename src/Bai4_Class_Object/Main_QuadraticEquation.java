package Bai4_Class_Object;
import java.util.Scanner;

public class Main_QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'a' value: ");
        int a = input.nextInt();
        System.out.println("Enter 'b' value: ");
        int b = input.nextInt();
        System.out.println("Enter 'c' value: ");
        int c = input.nextInt();

        QuadraticEquation temp = new QuadraticEquation(a, b, c);
        if (temp.getDiscriminant() > 0) {
            System.out.println("The roots of the equation are " + temp.getRoot1() + " and " + temp.getRoot2());
        }
        else {
            System.out.println("The equation has no roots.");
        }


    }
}
