package Bai2_Loop;
import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, lengthOfRectangle, weightOfRectangle, triangleEdge;
        choice = -1;

        while (choice!=0){
            System.out.println("------------------");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("------------------");
                    System.out.println("Length of the rectangle: ");
                    lengthOfRectangle = input.nextInt();
                    System.out.println("Weight of the rectangle: ");
                    weightOfRectangle = input.nextInt();
                    System.out.println("");

                    for (int i=0; i<lengthOfRectangle; i++){
                        for(int j=0; j<weightOfRectangle; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("------------------");
                    System.out.println("Triangle edge: ");
                    triangleEdge = input.nextInt();
                    System.out.println("");

                    for (int i=0; i<=triangleEdge; i++) {
                        for (int j=0; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("------------------");
                    System.out.println("Triangle edge: ");
                    triangleEdge = input.nextInt();
                    System.out.println("");

                    for (int i=triangleEdge; i>=1; i--) {
                        for (int j=0; j<i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
