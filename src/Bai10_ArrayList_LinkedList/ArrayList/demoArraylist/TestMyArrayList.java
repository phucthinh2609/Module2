package Bai10_ArrayList_LinkedList.ArrayList.demoArraylist;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Thịnh");
        list.add("Thiện");
        list.add("Phú");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");
        list.add("Tài");


        System.out.println("Element 1: " + list.get(1));
        System.out.println("Index of 'Phú' is: " + list.indexOf("Phú"));
        list.remove(1);
        list.remove(1);
        list.remove(1);

        list.add(2,"Phôn");
        System.out.println("Size of list: "+ list.size());
        list.printList();

        MyArrayList<String> clone = list.clone();
        System.out.println(clone.contains("Phôn"));
        System.out.println(clone.contains("Đại"));
        System.out.println("Element 3: " + clone.get(3));
        System.out.println("Size: " + clone.size());
        clone.clear();
        System.out.println("Size after clear: " + clone.size());
        clone.printList();
    }
}
