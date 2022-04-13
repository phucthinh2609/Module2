package Bai2_Loop;
import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money, interestRate, totalInterest;
        int month;

        System.out.println("Enter invest amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter a number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest in percentage: ");
        interestRate = scanner.nextDouble();
        totalInterest = 0;

        for (int i=0; i<month;i++){
            totalInterest += money * (interestRate/12) * month;
        }
        System.out.printf("Total of interest is: %.2f",totalInterest);
    }
}
