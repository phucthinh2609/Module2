package Bai4_Class_Object;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y){
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
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(15, 20);
        System.out.println(point2D);
    }
}
