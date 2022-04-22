package Bai4_Class_Object;

public class Static_Student {
    private int rollno;
    private String name;
    private static String college = "Hue College";

    Static_Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println("No Roll: "+this.rollno+", Name: "+this.name+", College: "+this.college);
    }

    public static void main(String[] args) {
        Static_Student.change();

        Static_Student st1 = new Static_Student(000, "Thinh");
        Static_Student st2 = new Static_Student(111, "Thien");
        st1.display();
        st2.display();
    }


}
