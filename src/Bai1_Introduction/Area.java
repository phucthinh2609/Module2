package Bai1_Introduction;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a width:  ");
        width = scanner.nextFloat();
        System.out.println("Enter a height:  ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println(area);

    }
}
