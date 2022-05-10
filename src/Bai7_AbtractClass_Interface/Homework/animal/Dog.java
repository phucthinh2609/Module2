package Bai7_AbtractClass_Interface.Homework.animal;

import Bai7_AbtractClass_Interface.Homework.active.Runable;

public class Dog extends Animal implements Runable {

    @Override
    public String run() {
        return "Dog can run";
    }

    @Override
    public String makeNoise() {
        return "Dog's noise: Gow-gow";
    }
}
