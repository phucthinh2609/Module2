package demoAbstract;

interface WaterBottle{
    String color = "blue";
    String nameWaterBottle = "Aquafina";

    public abstract void fillUp();
    void pourOut();
}


public class Thirsty implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(color);

        Thirsty ex = new Thirsty();
        ex.fillUp();
        ex.pourOut();
    }

    @Override
    public void fillUp() {
        System.out.println("filled");
    }

    @Override
    public void pourOut() {
        System.out.println("pour outed");
    }

}
