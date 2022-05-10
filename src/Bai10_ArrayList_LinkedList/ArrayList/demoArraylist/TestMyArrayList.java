package Bai10_ArrayList_LinkedList.ArrayList.demoArraylist;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Thịnh");
        list.add("Thiện");
        list.add("Phú");
        list.add("Tài");

        System.out.println("Element 1: " + list.get(1));
        System.out.println("Index of 'Phú' is: " + list.indexOf("Phú"));
        list.remove(1);
        list.add(1,"Phôn");
        print(list.getData());

        MyArrayList<String> clone = list.clone();
        System.out.println(clone.contains("Phôn"));
        System.out.println(clone.contains("Đại"));
        System.out.println("Element 3: " + clone.get(3));
        System.out.println("Size: " + clone.size());
        clone.clear();
        System.out.println("Size after clear: " + clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        System.out.print("ArrayList = [");
        for (int i =0; i<list.length -1; i++){
            if (!(list[i] == null)) {
                if (list[i + 1] == null){
                    System.out.print((String) list[i] );
                    break;
                }
                System.out.print((String) list[i] + ", ");
            }
        }
        System.out.println("]\n");


    }
}
