package Bai4_Class_Object;

public class Static_Car {
    private String nameCar;
    private String engine;
    public static int numberOfCar;

    public Static_Car(String nameCar, String engine){
        this.nameCar = nameCar;
        this.engine = engine;
        numberOfCar++;
    }

    void display(){
        System.out.println("Name car: "+this.nameCar+", \nEngine: "+this.engine+", \nNumber of car: "+this.numberOfCar);
    }


}
