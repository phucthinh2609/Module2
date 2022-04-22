package Bai4_Class_Object;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double side, double v, String color, boolean filled){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return (width+height)*2;
    }

    public double getPerimeter(){
        return width*height;
    }

    public String display(){
        return "Reactangle{width: "+width+", height: "+height+"";
    }

}
