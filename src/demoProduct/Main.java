package demoProduct;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product nokia = new Product(1,"Nokia", 5500000);
        Product iphone = new Product( 2, "Iphone",10000000);
        Product samsung = new Product( 3, "SamSung", 7000000);
        productManager.productList.add(nokia);
        productManager.productList.add(iphone);
        productManager.productList.add(samsung);
        productManager.menuManager();
    }
}
