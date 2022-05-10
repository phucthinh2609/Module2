package Bai10_ArrayList_LinkedList.product;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product blazer = new Product(1, "Blazer", 500000);
        Product pull = new Product(2, "Pull", 850000);
        Product shirt = new Product(3, "Shirt", 20000);
        productManager.productsList.add(blazer);
        productManager.productsList.add(pull);
        productManager.productsList.add(shirt);
        productManager.mainMenu();

    }
}
