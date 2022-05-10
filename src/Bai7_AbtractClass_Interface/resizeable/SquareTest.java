package Bai7_AbtractClass_Interface.resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(6.5);
        System.out.println(square);

        square = new Square(7.5, "red", false);
        System.out.println(square);

        Square square1 = new Square();
        square1.setSide(10);
        System.out.println(square1.getSide());
        square1.resize(0.5);
        System.out.println(square1.getSide());
    }
}
