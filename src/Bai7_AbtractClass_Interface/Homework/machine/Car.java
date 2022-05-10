package Bai7_AbtractClass_Interface.Homework.machine;

import Bai7_AbtractClass_Interface.Homework.active.Runable;

public class Car extends Machine implements Runable {
    @Override
    public String run() {
        return "Car can run";
    }

    @Override
    public String makeSound() {
        return "Car's sound: Wmm-Wmm";
    }
}
