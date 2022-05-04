package Bai11_Stack_Queues.GenericClass;

public class Main {
    public static void main(String[] args) {
        Controller<Student> list = new Controller<>();
//        list.add("A1");
//        list.add("A2");

        list.add(new Student("R1", "Nguyen Van A"));
        list.add(new Student("R2" , "Nguyen Van B"));


        System.out.println(list.get(1).rollNo);

    }
}
