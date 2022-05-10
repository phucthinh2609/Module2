package Bai10_ArrayList_LinkedList.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("1", "Thinh"));
        students.add(new Student("2", "Thien"));

        for(Student student : students){
            System.out.println(student);
        }



//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("A1");
//        list.add("A2");
//        list.add("AB");
//        list.add("A3");
//
//        String temp = list.get(2);
//        list.set(2, list.get(3));
//        list.set(3, temp);
//
//        for (String item: list){
//            System.out.println(item);
//        }
//
//        HashMap<String, String> stdList = new HashMap<>();
//        Student std = new Student("N1", "Tran Van A");
//        stdList.put(std.rollno, String.valueOf(std));
//        std = new Student("N2", "Tran Van B");
//
//        Set<String> keys = stdList.keySet();
//        for(String key: keys){
//            System.out.println( stdList.get(key));
//        }


    }
}
