package Bai4_Class_Object;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
        a=0.0;
        b=0.0;
        c=0.0;
    }

    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return Math.pow(a,2) - 4*a*c;
    }

    public double getRoot1(){
        return ((-b+Math.sqrt(this.getDiscriminant()))/2*a);
    }

    public double getRoot2(){
        return ((-b-Math.sqrt(this.getDiscriminant()))/2*a);
    }

    public double getEqualRoot(){
        return (-b + Math.sqrt(this.getDiscriminant()))/(2*a);
    }
}
