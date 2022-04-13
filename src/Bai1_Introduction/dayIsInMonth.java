package Bai1_Introduction;
import java.util.Scanner;

public class dayIsInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month do you want count days?");
        int month = scanner.nextInt();
        String daysInMonth;

        switch (month) {
            case 2:
//                System.out.println("The " + month + " have 28 or 29 days.");
                daysInMonth = "28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("The " + month + " month have 31 days.");
                daysInMonth = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("The " + month + " have 30 days.");
                daysInMonth = "30 days";
                break;
            default:
                daysInMonth = "";
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");

    }
}
