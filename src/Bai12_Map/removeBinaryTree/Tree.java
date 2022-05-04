package Bai12_Map.removeBinaryTree;

public interface Tree<E> {
    public boolean insert(E e);

    public void postorder();

    public void inorder();

    void preorder();

    int getSize();

    boolean remove(E e);

    boolean search(E e);
}
