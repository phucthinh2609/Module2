package Bai1_Introduction;
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

//        if (year%4 ==0) {
//            if (year%100 ==0) {
//                if(year%400 ==0) {
//                    System.out.printf("Nam %d la nam nhuan", year);
//                }else {
//                    System.out.printf("Nam %d khong phai nam nhuan", year);
//                }
//            }else {
//                System.out.printf("Nam %d la nam nhuan", year);
//            }
//        }else{
//            System.out.printf("Nam %d khong phai nam nhuan", year);
//        }

        boolean isLeapYear = false;
        if (year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("Nam %d la nam nhuan", year);
        }else{
            System.out.printf("Nam %d khong phai la nam nhuan", year);
        }
    }
}
