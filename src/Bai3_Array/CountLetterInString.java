package Bai3_Array;
import java.util.Scanner;

public class CountLetterInString {
    public static void main(String[] args) {
        String string = "I am a developer";
        Scanner input = new Scanner(System.in);

        char temp;
        System.out.println("Enter a letter: ");
        char input_letter = input.next().charAt(0);
        int count = 0;

        for(int i=0; i<string.length(); i++){
            temp = string.charAt(i);
            if(temp == input_letter)
                count++;
        }
        System.out.println("\nString = " + string);
        System.out.println(">> '"+input_letter + "' appaers "+count+" time in the String <<");
    }
}