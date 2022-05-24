package Bai10_ArrayList_LinkedList.productManager;

import java.util.*;

public class Main {
    static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        productList.add(new Product("Iphone", 12000));
        productList.add(new Product("Oppo", 23000));
        productList.add(new Product("Bphone", 2000));

        int choose;

        do{
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    inputProduct();
                    break;
                case 2:
                    editProductById();
                    break;
                case 3:
                    deleteProductById();
                    break;
                case 4:
                    displayProduct();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    sortProductByPriceCRE();
                    break;
                case 7:
                    sortProductByPriceDE();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập sai!!!");
            }
        }while (choose != 8);
    }

    private static void inputProduct() {
        System.out.println("\nNhập số sản phẩm muốn thêm vào");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<n; i++){
            Product product = new Product();
            product.input();

            productList.add(product);
        }
    }

    private static void editProductById() {
        displayProduct();
        System.out.println("\nNhập id sản phẩm muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());

        for(Product product: productList){
            if(product.getId() == id){
                product.input();
                break;
            }
        }
    }

    private static void deleteProductById() {
        displayProduct();
        System.out.println("\nNhập id sản phẩm muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());

        for(Product product: productList){
            if(product.getId() == id){
                productList.remove(product);
                break;
            }
        }
    }

    private static void displayProduct() {
        for (Product product : productList){
            product.display();
        }
    }

    private static void searchProductByName() {
        System.out.println("\nNhập tên sản phẩm muốn tìm");
        String name = scanner.nextLine();

        for(Product product: productList){
            if(product.getName().equalsIgnoreCase(name)){
                product.display();
                break;
            }
        }
        System.err.println("\nSản phẩm không tồn tại!!!");
    }

    private static void sortProductByPriceCRE() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() > o2.getPrice())
                    return 1;
                else
                    return -1;
            }
        });
    }

    private static void sortProductByPriceDE() {
            Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() > o2.getPrice())
                    return -1;
                else
                    return 1;
            }
        });
    }

    static void showMenu(){
        System.out.println("\n1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
        System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn: ");
        System.out.println("==> ");
    }






}
