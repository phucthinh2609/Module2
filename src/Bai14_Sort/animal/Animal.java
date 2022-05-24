package Bai14_Sort.animal;

public class Animal {
    String name;
    int age;
    int legNumber;

    public Animal() {
    }

    public Animal(String name, int age, int legNumber) {
        this.name = name;
        this.age = age;
        this.legNumber = legNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", legNumber=" + legNumber +
                '}';
    }
}
