package Kteam;

public class Person3 {
    public String name;
    public int age;
    public float height;

    public Person3(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person3 getInstance(){
        return this;
    }
}
