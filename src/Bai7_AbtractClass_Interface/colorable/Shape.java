package Bai7_AbtractClass_Interface.colorable;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString(){
        return "A shape with color of "
                + getColor()
                + " and "
                + (isFilled()? "filled" : "no filled");
    }
}
