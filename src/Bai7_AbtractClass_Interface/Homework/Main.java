package Bai7_AbtractClass_Interface.Homework;

import Bai7_AbtractClass_Interface.Homework.active.Barkable;
import Bai7_AbtractClass_Interface.Homework.active.Flyable;
import Bai7_AbtractClass_Interface.Homework.active.Runable;
import Bai7_AbtractClass_Interface.Homework.active.Swimable;
import Bai7_AbtractClass_Interface.Homework.animal.Animal;
import Bai7_AbtractClass_Interface.Homework.animal.Bird;
import Bai7_AbtractClass_Interface.Homework.animal.Dog;
import Bai7_AbtractClass_Interface.Homework.animal.Fish;
import Bai7_AbtractClass_Interface.Homework.machine.Car;
import Bai7_AbtractClass_Interface.Homework.machine.Machine;
import Bai7_AbtractClass_Interface.Homework.machine.Plane;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Fish();

        Machine[] machines = new Machine[2];
        machines[0] = new Car();
        machines[1] = new Plane();

        for(Animal animal: animals){
            System.out.println(animal.makeNoise());
            if(animal instanceof Barkable)
                System.out.println(((Barkable) animal).bark());
            if(animal instanceof Flyable)
                System.out.println(((Flyable) animal).fly());
            if(animal instanceof Runable)
                System.out.println(((Runable) animal).run());
            if(animal instanceof Swimable)
                System.out.println(((Swimable) animal).swim());
        }

        System.out.println("================================");

        for(Machine machine: machines){
            System.out.println(machine.makeSound());
            if(machine instanceof Barkable)
                System.out.println(((Barkable) machine).bark());
            if(machine instanceof Flyable)
                System.out.println(((Flyable) machine).fly());
            if(machine instanceof Runable)
                System.out.println(((Runable) machine).run());
            if(machine instanceof Swimable)
                System.out.println(((Swimable) machine).swim());
        }
    }
}
