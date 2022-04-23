package Bai6_Extands;

public class Shape2 {
    private String color = "green";

    public Shape2(){
    }

    public Shape2(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return "A shape with color is "
                + getColor();
    }

    public static void main(String[] args) {

        Shape2 shape2 = new Shape2();
        System.out.println(shape2);

        shape2 = new Shape2("blue");
        System.out.println(shape2);
    }
}
