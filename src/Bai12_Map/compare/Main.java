package Bai12_Map.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Thinh", 23, "Hue");
        Student student1 = new Student("Phu", 24, "Vinh");
        Student student2 = new Student("Vinh", 25, "Quang Tri");
        Student student3 = new Student("Tai", 22, "Hue");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student std: lists){
            System.out.println(std.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("===Sort by Age===");
        for(Student std : lists){
            System.out.println(std.toString());
        }


    }
}
