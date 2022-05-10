package Bai7_AbtractClass_Interface.Homework.animal;

import Bai7_AbtractClass_Interface.Homework.active.Swimable;

public class Fish extends Animal implements Swimable {
    @Override
    public String swim() {
        return "Fish can swim";
    }

    @Override
    public String makeNoise() {
        return "Fish can not make noise";
    }
}
