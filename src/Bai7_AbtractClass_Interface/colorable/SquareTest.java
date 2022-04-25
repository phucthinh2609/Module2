package Bai7_AbtractClass_Interface.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(6.5);
        System.out.println(square);

        square = new Square(7.5, "red", false);
        System.out.println(square);


    }
}
