package Bai12_Map.removeBinaryTree;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);
        System.out.println("inorder");
        tree.inorder();
        System.out.println("The numbers of nodes is " + tree.getSize());

        //delete
        System.out.println("Delete 19");
        if(tree.search(19)) {
            System.out.println("Tree have 19");
        } else System.out.println("Tree have not 19");

        tree.remove(19);
        System.out.println("inorder");
        tree.inorder();
        System.out.println("The number of nodes is " + tree.getSize());
        System.out.println("after delete 19");
        if (tree.search(19)) {
            System.out.println("tree have 19");
        } else System.out.println("tree have not 19");

        if(tree.search(42)) {
            System.out.println("tree have 42");
        } else System.out.println("tree have not 42");
    }
}
