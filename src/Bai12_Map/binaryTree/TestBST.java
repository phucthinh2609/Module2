package Bai12_Map.binaryTree;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Thinh");
        tree.insert("Tai");
        tree.insert("Phu");
        tree.insert("Vinh");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
