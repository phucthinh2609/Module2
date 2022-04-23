package Bai6_Extands;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(){
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getX(){
        return x;
    }

    public void setY(float y){
        this.y = y;
    }

    public float getY(){
        return y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] array = {x,y};
        return array;
    }

    public String toString(){
        return "("+x+", "+y+")";
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3.5f, 4.5f);
        System.out.println(point);
    }
}
