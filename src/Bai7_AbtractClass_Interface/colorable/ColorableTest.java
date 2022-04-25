package Bai7_AbtractClass_Interface.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5);
        shapes[1] = new Rectangle(6.5, 4.5);
        shapes[2] = new Square(5.5);


        for(Shape shape: shapes){
            System.out.println(shape.getArea());
            if(shape instanceof Square){
                Colorable colorable = new Square();
                colorable.howToColor();
            }
        }


    }
}
