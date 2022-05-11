package Bai10_ArrayList_LinkedList.ArrayList.demoArraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements =  new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        elements =  new Object[size];
    }

    public void checkBoundExclusive(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index" + index + ", Size: " + size);
        }
    }

    private void ensureCap() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);

    }

    public void add(E e) {
        if(size == elements.length){
            ensureCap();
        }
        elements[size++] = e;
    }

    public void add(int index, E e ) {
        checkBoundExclusive(index);
        if(size == elements.length){
            ensureCap();
        }
        if(size != elements.length){
            System.arraycopy(elements, index, elements, index+1, size-index);
        }
        elements[index] = e;
        size++;
    }

    public Object get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }

    @Override
    public MyArrayList clone() {
        MyArrayList<E> clone = new MyArrayList<>(elements.length);
        for (Object x : elements) {
            clone.add((E) x);
        }
        return clone;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        checkBoundExclusive(index);
        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[--size] = null;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        for (Object x : elements) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public void printList() {
        System.out.print("ArrayList = [");
        for (int i = 0; i < elements.length - 1; i++) {
            if (!(elements[i] == null)) {
                if (elements[i + 1] == null) {
                    System.out.print((String) elements[i]);
                    break;
                }
                System.out.print((String) elements[i] + ", ");
            }
        }
        System.out.println("]\n");
    }
}
