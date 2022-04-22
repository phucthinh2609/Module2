package Project;
import javax.swing.*;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
//        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

//        while (userAnswer != computerNumber)
//        {
//            String response = JOptionPane.showInputDialog(null,
//                    "Enter a guess between 1 and 100", "Guessing Game", 3);
//            userAnswer = Integer.parseInt(response);
//            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
//            count++;
//        }
        System.out.println(">>GUESSING GAME<<");
        while (userAnswer != computerNumber){
            System.out.println("================================");
            System.out.println("\nEnter a guess between 1 and 100");
            userAnswer = input.nextInt();
            System.out.println(determineGuess(userAnswer, computerNumber, count));;
            count++;
            if (count>10){
                System.out.println(">>GAME OVER!!!<<");
                break;
            }
        }
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
