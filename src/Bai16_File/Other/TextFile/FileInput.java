package Bai16_File.Other.FileText;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        //Phan3:Doc file
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");

//            int code = fis.read();
//            char c = (char) code;
//            System.out.println("c>> "+ c);

            int code;
            StringBuilder builder = new StringBuilder();
            while ((code = fis.read()) != -1) {
//                char c = (char) code;
//                System.out.print(c);
                builder.append((char) code);
            }
            String content = builder.toString();
            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
