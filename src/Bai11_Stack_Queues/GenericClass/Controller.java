package Bai11_Stack_Queues.GenericClass;

import java.util.ArrayList;

public class Controller <E extends People> {
    ArrayList<E> list = new ArrayList<>();

    public Controller(){
    }

    public void add(E e){
        list.add(e);
    }

    public E get(int index){
        return list.get(index);
    }
}
