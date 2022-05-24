package Bai14_Sort.animal;

import java.util.Comparator;

public class SortByAgeAndName implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        double result = o1.getAge() - o2.getAge();
        if (result == 0)
            return o1.getName().compareTo(o2.getName());
        return result > 0 ? 1 : -1;
    }
}
