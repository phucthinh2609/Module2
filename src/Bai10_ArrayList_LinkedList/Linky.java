package Bai10_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext()){
            if(it.next()==4)
                System.out.println("List has 4");
        }

        System.out.println(linkedList);

        ArrayList arrayList = new ArrayList();

        arrayList.add("Thinh");
        arrayList.add("Phon");
        arrayList.set(1, "Huy");

        System.out.println(arrayList);



    }
}
