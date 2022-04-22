package Kteam;

public class Person5 {
    public String name;
    private int age;
    public float height;

    public Person5(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age){
        if(age>0 && age<=100)
            this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public Person5 clone(){
        Person5 other = new Person5(this.name, this.age, this.height);
        return other;
    }

    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Height: "+this.height);
    }
}
