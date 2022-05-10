package Bai7_AbtractClass_Interface.Homework.machine;

import Bai7_AbtractClass_Interface.Homework.active.Flyable;

public class Plane extends Machine implements Flyable {
    @Override
    public String fly() {
        return "Plane's can fly";
    }

    @Override
    public String makeSound() {
        return "Plane's sound: Vwww-vwww";
    }
}
