package Bai4_Class_Object;


public class Cylinder2 extends Circle2 {
    private double height = 1.0;

    public Cylinder2(){
    }

    public Cylinder2(double height){
        this.height = height;
    }

    public Cylinder2(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }

    public String toString() {
        return "A Cylinder with height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder2 cylinder = new Cylinder2();
        System.out.println(cylinder);

        cylinder = new Cylinder2(3.5);
        System.out.println(cylinder);

        cylinder = new Cylinder2(3.5, 4.5, "black");
        System.out.println(cylinder);

        System.out.println("Cylinder's volume is: "+cylinder.getVolume());
    }
}
