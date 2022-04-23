package Bai6_Extands;
import java.util.Scanner;

public class Triangle2 extends Shape2{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle2(){
    }

    public Triangle2(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide1(){
        return side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide2(){
        return side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getSide3(){
        return side3;
    }

//    public void setColor(String)

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getHeight(){
        double p = getPerimeter()/2;
        return (2*Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)))/side1;
    }

    public double getArea(){
        return 0.5*side1*getHeight();
    }

    public String toString(){
        return "A Triagle with Perimeter= "
                + getPerimeter() + " and Area= "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a color of triangle: ");
        String color = input.nextLine();
        System.out.println("Enter a shape1: ");
        double shape1 = input.nextDouble();
        System.out.println("Enter a shape2: ");
        double shape2 = input.nextDouble();
        System.out.println("Enter a shape3: ");
        double shape3 = input.nextDouble();


        Triangle2 triangle2 = new Triangle2();
        System.out.println(triangle2);

        triangle2 = new Triangle2(shape1, shape2, shape3);
        triangle2.setColor(color);
        System.out.println(triangle2);
    }
}
