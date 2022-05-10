package Bai5_Access_Modifier;

public class Student {
    private String name = "John";
    private String clas = "C02";

    Student(){
    }

    void setName(String name){
        this.name = name;
    }

    protected void setClasses(String clas){
        this.clas = clas;
    }
}

class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Phu");
        student.setClasses("C03");
    }
}
