package Kteam;

public class Student4 extends Person4 {
    String universityName;
    public Student4(String name, int age, float height, String universityName){
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("University: "+universityName);
    }

}
