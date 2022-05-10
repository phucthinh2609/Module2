package Bai16_File.Other.FileText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader("test.txt");
            bufferedReader = new BufferedReader(reader);

//            String line = bufferedReader.readLine();
//            System.out.println(line);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
