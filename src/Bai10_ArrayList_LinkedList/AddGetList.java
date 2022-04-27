package Bai10_ArrayList_LinkedList;

import java.util.Arrays;

public class AddGetList<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public AddGetList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCap(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e){
        if(size == elements.length){
            ensureCap();
        }
        elements[size++]= e;
    }

    public E get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index );
        }
        return (E) elements[index];
    }

    public static void main(String[] args) {
        AddGetList<Integer> myList = new AddGetList<>();

        myList.add(2);
        myList.add(3);
        myList.add(4);

        System.out.println("Element 2: "+myList.get(2));
        System.out.println("Element 1: "+myList.get(1));

//        myList.get(5);
//        System.out.println("Element 5: "+ myList.get(5));

        myList.get(-1);
        System.out.println("Element -1: "+ myList.get(-1));

    }
}
