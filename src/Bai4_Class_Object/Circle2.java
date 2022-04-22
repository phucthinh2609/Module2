package Bai4_Class_Object;

public class Circle2 {
    private double radius = 1.0;
    private String color = "green";

    public Circle2(){
    }

    public Circle2(double radius){
        this.radius = radius;
    }

    public Circle2(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "A Circle with color of "
                + getColor()+" and "
                + "radius is "+getRadius();
    }

    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        System.out.println(circle);

        circle = new Circle2(3.5);
        System.out.println(circle);

        circle = new Circle2(4.5, "blue");
        System.out.println(circle);
    }
}
