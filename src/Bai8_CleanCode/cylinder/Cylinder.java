package Bai8_CleanCode.cylinder;

public class Cylinder {
    public static double getVolume (int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = 2*baseArea*perimeter*radius;
        return volume;
    }

    private static double getBaseArea(int radius){
        return radius*radius*Math.PI;
    }

    private static double getPerimeter(int radius){
        return 2*radius*Math.PI;
    }
}
