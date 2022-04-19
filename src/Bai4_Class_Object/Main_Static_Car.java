package Bai4_Class_Object;

public class Main_Static_Car {
    public static void main(String[] args) {
        Static_Car car1 = new Static_Car("Toyota", "Skype1");
        car1.display();
        System.out.println(car1.numberOfCar);

        Static_Car car2 = new Static_Car("MG", "Skype2");
        car2.display();
        System.out.println(car2.numberOfCar);
    }
}
