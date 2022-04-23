package Bai4_Class_Object;

public class Shape_Circle extends Shape{
    private double radius = 1.0;

    public Shape_Circle(){
    }

    public Shape_Circle(double radius){
        this.radius = radius;
    }

    public Shape_Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "A Circle with radius="
                + getRadius()+", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Shape_Circle circle = new Shape_Circle();
        System.out.println(circle);

        circle = new Shape_Circle(3.5);
        System.out.println(circle);

        circle = new Shape_Circle(4.9, "yellow", true);
        System.out.println(circle);
    }
}
