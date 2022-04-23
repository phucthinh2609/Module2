package Bai6_Extands;

public class Shape_Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;

    public Shape_Rectangle(){
    }

    public Shape_Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Shape_Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public String toString(){
        return "A Rectangle with width="
                + getWidth()+" and length="
                + getHeight()+", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Shape_Rectangle rectangle = new Shape_Rectangle();
        System.out.println(rectangle);

        rectangle = new Shape_Rectangle(3.5, 4.5);
        System.out.println(rectangle);

        rectangle = new Shape_Rectangle(5.5, 6.5, "black", false);
        System.out.println(rectangle);
    }
}
