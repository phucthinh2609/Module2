package Bai12_Map.removeBinaryTree;

public class BST<E extends Comparable<E>> extends AbtractTree<E> {
    protected TreeNode<E> root;
    protected int size =0;

    public BST(){}

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public void postorder() {
        postorder();
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if( root == null ) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        removeNode(this.root, e);
        size--;
        return true;
    }

    protected TreeNode<E> removeNode(TreeNode<E> root, E e) {
        if (root == null) return root;
        if (e.compareTo(root.element) < 0 )
            root.left = removeNode(root.left, e);
        else if (e.compareTo(root.element) > 0)
            root.right = removeNode(root.right, e);
        else {
            if(root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else  {
                TreeNode<E> temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                root.element = temp.element;
                root.right = removeNode(root.right, temp.element);
            }
        }
        return root;
    }



    @Override
    public boolean search(E e) {
        if (root == null) {
            return false;
        }
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current =current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
