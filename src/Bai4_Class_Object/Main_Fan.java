package Bai4_Class_Object;

public class Main_Fan {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.turnOn();
        Fan1.setColor("yellow");
        Fan1.setRadius(10);
        Fan1.setSpeed(3);
        System.out.println(Fan1.display());

        Fan Fan2 = new Fan();
        Fan2.turnOff();
        Fan2.setColor("blue");
        Fan2.setRadius(5);
        Fan2.setSpeed(2);
        System.out.println(Fan2.display());
    }
}
