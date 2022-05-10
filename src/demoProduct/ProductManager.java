package demoProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public ArrayList<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }
    // kiểm tra xem có sản phẩm trong list chưa?
    public boolean isThereAnyProductsOnTheList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product)
                    return true;
            }
        }
        return false;
    }

    // kiểm tra id sản phẩm
    public boolean isIdInProductList(int id) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getId() == id)
                    return true;
            }
        }
        return false;
    }


    // kiểm tra xem tên có nằm trong danh sách chưa?
    public boolean isNameAProductList(String name) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName().equalsIgnoreCase(name))
                    return true;
            }
        }
        return false;
    }

    public void addProduct() {
        String name;
        int id;
        double price;
        Scanner input = new Scanner(System.in);

        // nhập name, nếu name nhập vào đã có thì phải nhập lại
        do {
            System.out.println("Product name: ");
            name = input.nextLine();
            if(isNameAProductList(name))
                System.out.println("Product have had in the product list");
        } while (isNameAProductList(name));

        // nhập vào id, nếu id nằm trong list thì phải nhập lại
        do {
            System.out.print("Product id: ");
            id = input.nextInt();
            if (isIdInProductList(id)) {
                System.out.println("Id had in the product list");
            }
        } while (isIdInProductList(id));

        System.out.println("Product price : ");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }


    public void setProductListWithId() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list ");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need edit ");
            int id = input.nextInt();

            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Product have id is " + id + " : " + product);
                        char choice;

                        do {
                            System.out.println("Menu edit Product");
                            System.out.println("1. Edit name product");
                            System.out.println("2. Edit id product");
                            System.out.println("3. Edit price Product");
                            System.out.println("0. Exit");
                            System.out.println("--------------------");
                            Scanner sc = new Scanner(System.in);
                            choice = sc.nextLine().charAt(0);


                            switch (choice) {
                                case '1' :
                                    System.out.print("New name: ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2' :
                                    System.out.print("New Id : ");
                                    int newID = sc.nextInt();
                                    product.setId(newID);
                                    break;
                                case '3' :
                                    System.out.println("New Price : ");
                                    int newPrice = sc.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0' :
                                    menuManager();
                                    break;
                            }
                        } while (choice !=0);
                    }
                }
            }
        }
    }

    public void findProductInProductWithName() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Product need find : ");
            String name = sc.nextLine();
            if (isNameAProductList(name)) {
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(name)) {
                        System.out.println(product);
                    } else {
                        System.out.println("Not  have");
                    }
                }
            }
        }
    }

    public void deleteProductInProductWithId() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list! ");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need remove ");
            int id = input.nextInt();
            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Product remove is : " + product.toString());
                        productList.remove(id);
                    }
                }
            } else {
                System.out.println("Id have not in product list ");
            }
        }
    }

    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list" );
        } else {
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortPriceAscending() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list! ");
        } else {
            PriceAscendingComparator priceAscendingComparator = new PriceAscendingComparator();
            Collections.sort(productList, priceAscendingComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortPriceDecrease() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            PriceDereaseComparator priceDereaseComparator = new PriceDereaseComparator();
            Collections.sort(productList, priceDereaseComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
            }
        }
    }

    public void menuManager() {
        char choice = '?';
        while (choice != '0') {
            System.out.println("Menu product Manager ");
            System.out.println("1. Add Product ");
            System.out.println("2. Edit Product with id ");
            System.out.println("3. find product with name ");
            System.out.println("4. Delete product with id ");
            System.out.println("5. Display product list ");
            System.out.println("6. Sort in ascending order of price");
            System.out.println("7. Sort in decrease order of price");
            System.out.println("0. Exit progame");
            System.out.println("------------------------");
            System.out.println("choice : ");
            Scanner change = new Scanner(System.in);
            choice = change.nextLine().charAt(0);

            switch (choice) {
                case '1' :
                    addProduct();
                    break;
                case '2' :
                    setProductListWithId();
                    break;
                case '3' :
                    findProductInProductWithName();
                    break;
                case '4' :
                    deleteProductInProductWithId();
                    break;
                case '5' :
                    displayProduct();
                    break;
                case '6' :
                    sortPriceAscending();
                    break;
                case '7' :
                    sortPriceDecrease();
                    break;
                case '0' :
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

}
