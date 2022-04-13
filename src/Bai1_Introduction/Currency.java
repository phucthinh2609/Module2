package Bai1_Introduction;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD");
        double usd = scanner.nextDouble();
        int vnd = 23000;

        double rate = vnd * usd;

        System.out.printf("USD : %.0f", rate);

    }
}
