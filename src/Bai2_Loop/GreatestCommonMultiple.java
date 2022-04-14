package Bai2_Loop;
import java.util.Scanner;

public class GreatestCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so 1: ");
        int number1 = input.nextInt();
        System.out.println("Nhap so 2: ");
        int number2 = input.nextInt();
        int max;
        int flag;

        if(number1==0 || number2==0) {
            System.out.println("Khong co BCNN");
        }

        if(number1>number2){
            max = number1;
        }else{
            max = number2;
        }

        flag = max;

        while(true) {
            if(flag%number1 == 0 && flag%number2 ==0) {
                System.out.println("BCNN la: " + flag);
                break;
            }
            flag += max;
        }
    }
}
