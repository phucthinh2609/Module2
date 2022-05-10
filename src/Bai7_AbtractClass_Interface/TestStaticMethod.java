package Bai7_AbtractClass_Interface;

class Student{
    int rollno;
    String name;
    static String college = "HUE COLLEGE";

    static void change(){
        college = "CODE GYM";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }



    void display(){System.out.println(rollno+" "+name+" "+college);}

    static {
        System.out.println("Anh Cu Dep Trai");
    }
}
public class TestStaticMethod{
    public static void main(String args[]){
        Student.change();//calling change method
        //creating objects
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        Student s3 = new Student(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
