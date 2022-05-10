package Bai7_AbtractClass_Interface.Homework.animal;

import Bai7_AbtractClass_Interface.Homework.active.Barkable;
import Bai7_AbtractClass_Interface.Homework.active.Runable;

public class Bird extends Animal implements Barkable, Runable {
    @Override
    public String bark() {
        return "Bird can bark";
    }

    @Override
    public String run() {
        return "Bird can run";
    }

    @Override
    public String makeNoise() {
        return "Bird's noise: Chip-chip";
    }
}
