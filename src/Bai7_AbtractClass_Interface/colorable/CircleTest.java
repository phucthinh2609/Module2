package Bai7_AbtractClass_Interface.colorable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(4.5, "blue", false);
        System.out.println(circle);
    }
}
