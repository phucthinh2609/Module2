package Bai14_Sort.animal;

public class Main {
    public static void main(String[] args) {
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal("Dog", 2, 4));
//        animals.add(new Animal("Sneak", 4, 0));
//        animals.add(new Animal("Cat", 2, 4));
//        for (Animal animal : animals){
//            System.out.println(animal);
//        }
//
//        System.out.println("\nAfter Insert Sort");
//        animals.sort(new SortByAgeAndName());
//        for (Animal animal : animals){
//            System.out.println(animal);
//        }


        AnimalsArrayInObj animals = new AnimalsArrayInObj();
        animals.add(new Animal("Dog", 2, 4));
        animals.add(new Animal("Sneak", 4, 0));
        animals.add(new Animal("Cat", 2, 4));

//        System.out.println("\nBefore sort");
//        animals.print();
//
//        animals.insertionSort();
//        System.out.println("\nAter sort");
//        animals.print();

        animals.insertionSort();
        animals.print();

    }
}
