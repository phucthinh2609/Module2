package Bai2_Loop;
import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        if(a==0 || b==0){
            System.out.println("No greatest factor");
        }

        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        System.out.printf("greatest common factor is: %d", a);
    }
}
