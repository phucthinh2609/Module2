package Project.studentManager;

import java.util.Scanner;

public class Student {
    static int count = 0;
    int id = 0;
    int age;
    String name;
    String address;
    float gpa;

    public Student() {
        id = ++count;
    }

    public Student(int age,String name, String address, float gpa) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void display(){
        System.out.println(this);
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập name: ");
        name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập adress: ");
        address = scanner.nextLine();

        System.out.println("Nhập GPA: ");
        gpa = Float.parseFloat(scanner.nextLine());
    }

    public String getFileLine(){
        return id + ", " + name + ", " + age + ", " + address + ", " + gpa + ", " + "\n";
    }

    public void parse(String line){
        String[] params = line.split(", ");

        try{
            id = Integer.parseInt(params[0]);
            name = params[1];
            age = Integer.parseInt(params[2]);
            address = params[3];
            gpa = Float.parseFloat(params[4]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());;
        }finally {
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

