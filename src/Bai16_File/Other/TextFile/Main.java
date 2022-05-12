package Bai16_File.Other.TextFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nguyen Van A", "Ha Noi"));
        studentList.add(new Student("Nguyen Van B", "Hue"));
        studentList.add(new Student("Nguyen Van C", "Quang Binh"));

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("students.txt");

            String line = Student.getFileHeaderFormat() + "\n";
            byte[] b = line.getBytes();
            fos.write(b);

            for(Student std : studentList){
                line = std.getFileLineFormat() + "\n";
                b = line.getBytes();

                fos.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
