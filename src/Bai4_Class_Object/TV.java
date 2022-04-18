package Bai4_Class_Object;

public class TV {
    int chanel =1;
    int volumeLevel = 0;
    boolean on = true;

    public TV(){
    }

    public void turnOn(){
        on =true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChanel(int newChanel){
        if(on && newChanel>1 || newChanel<=120)
            chanel = newChanel;
    }

    public void setVolumeLevel (int newVolume){
        if(on && newVolume>1 || newVolume<=7)
            volumeLevel = newVolume;
    }

    public void chanelUp(){
        if (on && chanel<120)
            chanel++;
    }

    public void chanelDown(){
        if(on && chanel>1)
            chanel--;
    }

    public void volumeUp(){
        if(on && volumeLevel<7)
            volumeLevel++;
    }

    public void volumeDown(){
        if(on && volumeLevel>0)
            volumeLevel++;
    }


    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChanel(35);
        tv1.setVolumeLevel(4);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.chanelUp();
        tv2.chanelUp();
        tv2.volumeUp();

        System.out.println("tv1's chanel is "+tv1.chanel+" and volume is "+ tv1.volumeLevel);
        System.out.println("tv1's chanel is "+tv2.chanel+" and volume is "+ tv2.volumeLevel);
    }
}
