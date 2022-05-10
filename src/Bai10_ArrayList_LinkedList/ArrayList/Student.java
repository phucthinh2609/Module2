package Bai10_ArrayList_LinkedList.ArrayList;

public class Student {
    String rollno;
    String fullname;

    public Student(String rollno, String fullname) {
        this.rollno = rollno;
        this.fullname = fullname;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno='" + rollno + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
