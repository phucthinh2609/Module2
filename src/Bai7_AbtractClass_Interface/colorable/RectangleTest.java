package Bai7_AbtractClass_Interface.colorable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle);

        rectangle = new Rectangle(5.5, 6.5, "blue", false);
        System.out.println(rectangle);
    }
}
