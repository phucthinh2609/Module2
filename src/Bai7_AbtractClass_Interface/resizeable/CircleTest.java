package Bai7_AbtractClass_Interface.resizeable;
import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(4.5, "blue", false);
        System.out.println(circle);

//        Resizeable[] circles = new Resizeable[3];
//        circles[0] = new Circle();
//        circles[1] = new Circle(3.5);
//        circles[2] = new Circle(4.5, "blue", false);
//
//        for(Resizeable circle: circles){
//            System.out.println(circle.resize(2.0));
//        }
        Circle c = new Circle();
        System.out.println(c.getRadius());
        c.resize(0.5);
        System.out.println(c.getRadius());

    }
}
