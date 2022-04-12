package Bai1_Introduction;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Phuong trinh bac nhat");
        System.out.println("Co dang a*x + b = c");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a==0 && b==0) {
            System.out.println("Phuong trinh vo so nghiem");
        }else{
            if(a==0 && b != 0) {
                System.out.println("Phuong trinh vo nghiem");
            }else{
                if(a!=0) {
                    double result = -b/a;
                    System.out.println("Phuong trinh co nghiem la x = " + result);
                }
            }
        }

    }
}
