package Bai4_Class_Object;

public class Circle_AccessModifier {
    private double radius = 1;
    private String color = "red";

    Circle_AccessModifier(){
    }

    Circle_AccessModifier(double newRadius){
        radius = newRadius;
    }

    private double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }
}

class TestCircle{
    public static void main(String[] args) {
        Circle_AccessModifier circle = new Circle_AccessModifier(10);
        System.out.println(circle.getColor());;
        System.out.println(circle.getRadius());;
    }
}
