package Bai7_AbtractClass_Interface.resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle);

        rectangle = new Rectangle(5.5, 6.5, "blue", false);
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Pre-resize height: "+rectangle.getHeight());
        System.out.println("Pre-resize width: "+rectangle.getWidth());
        rectangle.resize(0.5);
        System.out.println("After-resize height: "+rectangle.getHeight());
        System.out.println("After-resize width: "+rectangle.getWidth());


    }
}
