package Bai16_File.Other.TextFile;

import java.io.Serializable;

public class Student implements Serializable {
    String name, address;

    public Student() {
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getFileHeaderFormat(){
        return "Name, Address";
    }

    public String getFileLineFormat(){
        return name + ", " +address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
