package Bai1_Introduction;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double weight, height, bmi;

        System.out.println("Your weight (kilogram): ");
        double weight = scanner.nextDouble();
        System.out.println("Your height (meter): ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi<18.5) System.out.printf("%-20.2f%s", bmi , " : Underweight" );
        else if(bmi<25.0) System.out.printf("%-20.2f%s", bmi , " : Normal");
        else if(bmi<30.0) System.out.printf("%-20.2f%s", bmi , " : OverWeight");
        else  System.out.printf("%-20.2f%s", bmi , " : Obese");

    }
}
