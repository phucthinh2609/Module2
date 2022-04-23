package Bai6_Extands;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        setX(x);
        setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed(){
        float[] array = {xSpeed, ySpeed};
        return array;
    }

    public String toString(){
        return "("+getX()+","+getY()+"), speed=("+getXSpeed()+","+getYSpeed()+")";
    }

    public MovablePoint move(){
        x += getXSpeed();
        y += getYSpeed();
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3.5f, 3.5f, 4.5f, 4.5f);
        System.out.println(movablePoint);

        System.out.println(movablePoint.move());
    }
}
