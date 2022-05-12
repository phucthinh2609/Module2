package Bai16_File.Other.TextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFileTest {
    public static void main(String[] args) {
//        saveFile();
        readFile();
    }

    static void readFile(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("student.dat");
            ois = new ObjectInputStream(fis);

            List<Student> studentList = (List<Student>) ois.readObject();

            for(Student std : studentList){
                System.out.println(std);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void saveFile(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nguyen Van A", "Ha Noi"));
        studentList.add(new Student("Nguyen Van B", "Hue"));
        studentList.add(new Student("Nguyen Van C", "Quang Binh"));

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("student.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);

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
