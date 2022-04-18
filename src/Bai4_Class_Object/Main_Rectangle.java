package Bai4_Class_Object;
import java.util.Scanner;

public class Main_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a width: ");
        double width = input.nextDouble();
        System.out.println("Enter a height: ");
        double height = input.nextDouble();

        Rectangle a = new Rectangle(width, height);
        System.out.println("Your rectangle:\n" + a.display());
        System.out.println("\nRectangle's Area is: "+a.getArea());
        System.out.println("Rectangle's CPerimeter is: "+a.getPerimeter());
    }
}
