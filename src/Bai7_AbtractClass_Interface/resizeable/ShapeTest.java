package Bai7_AbtractClass_Interface.resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("black" , false);
        System.out.println(shape);
    }
}