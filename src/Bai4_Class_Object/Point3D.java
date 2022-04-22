package Bai4_Class_Object;
import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(){
    }

    public Point3D(float z){
        this.z = z;
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public float getZ(){
        return z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = {getX(),getY(),z};
        return array;
    }

    public String toString(){
        return "A Cylinder with height="
                + "("+getX()+", "+getY()+ ", " +z+ ")"
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3.5f,3.6f,3.7f);
        System.out.println(point3D);
    }
}
