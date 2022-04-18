package Bai4_Class_Object;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    //Active
    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public boolean isOn(){
        return on;
    }
    //Radius
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getRadius(){
        return radius;
    }
    //Color
    public void setColor(String newColor){
        color = newColor;
    }

    public String getColor(){
        return color;
    }
    //Speed
    public void setSpeed(int newSpeed){
        if(newSpeed>0 && newSpeed<4)
            speed = newSpeed;
    }

    public String getSpeed(){
        String temp = "";
        switch (speed){
            case SLOW: temp = "SLOW"; break;
            case MEDIUM: temp = "MEDIUM"; break;
            case FAST: temp = "FAST"; break;
        }
        return temp;
    }


    //Display
    public String display(){
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", radius: " + radius + ", color: " + color + "\nfan is on\n";
        }
        else{
            return "\nFan speed: " + getSpeed() + ", radius: " + radius + ", color: " + color + "\nfan is off\n";
        }
    }

}
