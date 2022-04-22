package Bai4_Class_Object;

public class Shape_Square extends Shape_Rectangle{
    public Shape_Square(){
    }

    public Shape_Square(double side){
        super(side, side);
    }

    public Shape_Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Shape_Square square = new Shape_Square();
        System.out.println(square);

        square = new Shape_Square(6.5);
        System.out.println(square);

        square = new Shape_Square(7.5, "red", false);
        System.out.println(square);
    }
}
