package Bai2_Loop;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        if(number<2){
            System.out.printf("%d is not a prime", number);
        }else{
            boolean check = true;
            int i = 2;
            while (i<number){
                if(number%i==0){
                    check = false;
                }
                i++;
            }
            if(check) System.out.printf("%d is a prime", number);
            else System.out.printf("%d is not a prime", number);
        }
    }
}
