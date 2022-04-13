package Bai1_Introduction;
import java.util.Scanner;

public class NumbertoWord {
    public static void units (int n) {
        switch (n) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }

    public static void special (int n) {
        switch (n) {
            case 11:
                System.out.print("eleven ");
                break;
            case 12:
                System.out.print("twelve ");
                break;
            case 13:
                System.out.print("thirteen ");
                break;
            case 14:
                System.out.print("fourteen ");
                break;
            case 15:
                System.out.print("fifteen ");
                break;
            case 16:
                System.out.print("sixteen ");
                break;
            case 17:
                System.out.print("seventeen ");
                break;
            case 18:
                System.out.print("eighteen ");
                break;
            case 19:
                System.out.print("nineteen ");
                break;
        }
    }

    public static void tens (int n) {
        switch (n) {
            case 1:
                System.out.print("ten ");
                break;
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
    }

    public static void hundred (int n) {
        switch (n) {
            case 1:
                System.out.print("one hundred ");
                break;
            case 2:
                System.out.print("two hundred ");
                break;
            case 3:
                System.out.print("three hundred ");
                break;
            case 4:
                System.out.print("four hundred ");
                break;
            case 5:
                System.out.print("five hundred ");
                break;
            case 6:
                System.out.print("six hundred ");
                break;
            case 7:
                System.out.print("seven hundred ");
                break;
            case 8:
                System.out.print("eight hundred ");
                break;
            case 9:
                System.out.print("nine hundred ");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number [from 0 to 999]>> ");
        int number = input.nextInt();

        while (number < 0 || number > 999) {
            System.out.println("Input invalid");
            System.out.println("Enter a number [from 0 to 999]>> ");
            number = input.nextInt();
        }

        if(number>99 && number<1000) {
            int h = number/100;
            hundred(h);

            int x = number%100;
            if(x>10 && x<20){
                special(x);
            }

            if (x>19 && x<100){
                int tens = x/10;
                tens(tens);
                int units = x%10;
                units(units);
            }

            if(x<11) {
                int tens = x/10;
                tens(tens);
                int units = x%10;
                units(units);
            }

        }

        if (number>19 && number<99) {
            int tens = number/10;
            tens(tens);
            int u = number%10;
            units(u);
        }

        if (number>10 && number <20) {
            special(number);
        }

        if (number<11) {
            int te = number/10;
            tens(te);
            units(number);
        }
    }
}
