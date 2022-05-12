package Bai16_File.Other.TextFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileClass_FileOutput {
    public static void main(String[] args) {
        //Phan 1: File class
        File file = new File("vidu.txt");

        if(file.exists())
            System.out.println("File exists");
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {

            }
        }
            System.out.println("File not found");

        //Phan2: Ghi du lieu
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("test.txt");
            Scanner input = new Scanner(System.in);
//            String line = "MAI VAN PHUC THINH";
//            byte[] b =line.getBytes();
//            fos.write(b);

            for(;;){
                System.out.println("Insert line into file: ");
                String line = input.nextLine() + "\n";
                byte[] b = line.getBytes();
                fos.write(b);

                System.out.println("Continue Y/N: ");
                String choose = input.nextLine();
                if(choose.equalsIgnoreCase("N"))
                    break;
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
