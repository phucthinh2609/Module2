package Bai10_ArrayList_LinkedList.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if (capacity<0){
            throw new IllegalArgumentException();
//            elements = (E[]) new Object[capacity];
        }
    }

    public void checkBoundExclusive(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index" + index + ", Size: " + size);
        }
    }

    public void ensureCap(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element){
        checkBoundExclusive(index);
        if(size == elements.length){
            ensureCap();
        }
        if(size != elements.length){
            System.arraycopy(elements, index, elements, index+1, size-index);
        }
        elements[index] = element;
        size++;
    }



//    public E remove(int index){
//        checkBoundExclusive(index);
//        return;
//    }



    public static void main(String[] args) {
        MyList<String> arrlist = new MyList<>();


    }

}
