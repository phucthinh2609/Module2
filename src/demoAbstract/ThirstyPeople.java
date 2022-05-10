package demoAbstract;

interface WaterBottle{
    String color = "blue";
    String nameWaterBottle = "Aquafina";

    public abstract void fillUp();
    void pourOut();
}


public class ThirstyPeople implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(color);

        ThirstyPeople ex = new ThirstyPeople();
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
