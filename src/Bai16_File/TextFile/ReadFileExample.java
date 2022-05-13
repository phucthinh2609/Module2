package Bai16_File.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileExample(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Sum of line: " + sum);

        }catch (Exception e){
            System.err.println("File not found or error");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path: ");
//        String filePath = scanner.nextLine();

        String filePath = "/Users/macbookair/Desktop/Codegym/Module2/test.txt";
        filePath = "/Users/macbookair/Desktop/Codegym/Module2/students.txt";

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(filePath);
    }
}
