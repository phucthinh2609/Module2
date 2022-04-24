package Bai7_AbtractClass_Interface.Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.6, "black", false);
        circles[2] = new Circle(3.5);

        System.out.println("Pre-sort: ");
        for(Circle circle: circles){
            System.out.println(circle);
        }

        Comparator comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles, comparatorCircle);

        System.out.println("After sort");
        for(Circle circle:circles){
            System.out.println(circle);
        }
    }
}
