package Bai3_Array;
import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] students = {"Tien", "Huy", "Dai", "Phu"};

        System.out.println("Input a name who you want find: ");
        String input_name = input.nextLine();
        boolean isExit = false;

        for(int i=0; i<students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("Position of "+ input_name +" at index: "+ i +"");
                isExit = true;
                break;
            }
        }
        if(!isExit){
            System.out.println(input_name + " is not in list name");
        }



    }
}
