package Bai14_Sort.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsArrayInObj {
    private static List<Animal> animals;

    private int index;

    public AnimalsArrayInObj() {
        animals = new ArrayList<>();

    }


    public void add(Animal animal) {
        animals.add(animal);
    }

    public void print() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

//    public void insertionSort() {
//
//        int in, out;
//
//        for (out = 1; out < index; out++) {
//            Animal temp = animals[out];
//
//            in = out;
//
//            while (in > 0 && animals[in - 1].getName().compareTo(temp.getName()) > 0) {
//                animals[in] = animals[in - 1];
//                --in;
//            }
//
//            animals[in] = temp;
//        }
//    }

    public void insertionSort() {
//        Animal temp;
//        temp = animals.get(1);
//        animals.get(0) = temp;


        for (int i = 1; i < animals.size(); i++) {
            Animal temp = animals.get(i);
            for (int j = i - 1; j >= 0; j--) {
//                if (animals.get(j).getAge() == temp.getAge()){
//                    animals.get(j + 1).getName().compareTo(animals.get(j).getName());
//                }
                animals.get(j + 1).getName().compareTo(temp.getName());

//                if (animals.get(j).getAge() > temp.getAge()) {
//                    animals.get(j + 1) = animals.get(j);
//                    animals[j] = temp;
//                }
            }
        }
//        return animals;
    }
}
