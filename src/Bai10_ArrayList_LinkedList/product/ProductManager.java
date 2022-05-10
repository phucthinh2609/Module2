package Bai10_ArrayList_LinkedList.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public ArrayList<Product> productsList;
    Scanner input = new Scanner(System.in);

    public ProductManager(){
        productsList = new ArrayList<>();
    }

//  CheckName
    private boolean isName(String name){
        if(!productsList.isEmpty()){
            for(Product product: productsList){
                if (product.getName().equals(name))
                    return true;
            }
        }
        return false;
    }
//  CheckId
    private boolean isId(int id){
        if(!productsList.isEmpty()){
            for (Product product: productsList){
                if(product.getId() == id)
                    return true;
            }
        }
        return false;
    }

    public void add(){
        int id;
        String name;
        double price;

        do {
            System.out.println("Nhập id sản phẩm");
            id = input.nextInt();
            if(!isId(id))
                System.out.println("Id sản phẩm");
        }while (isId(id));

        do{
            System.out.println("Nhập tên sản phẩm");
            name = input.nextLine();
            if(!isName(name))
                System.out.println("Tên sản phẩm đã tồn tại");

        }while (isName(name));

        System.out.println("Nhập giá sản phẩm");
        price = Double.parseDouble(input.nextLine());
        Product newProduct = new Product(id, name, price);
        productsList.add(new Product());
    }

    public void update(){
        int id;

        display();
        do {
            System.out.println("Nhập id sản phẩm muốn sửa");
            id = input.nextInt();
            if(!isId(id))
                System.out.println("Id không tồn tại!");
        }while (isId(id));

        int choice;
        do{
            System.out.println("1. Chỉnh sửa id");
            System.out.println("2. Chỉnh sửa tên");
            System.out.println("3. Chỉnh sửa giá");
            System.out.println("0. Thoát");
            System.out.println("\nLựa chọn tính năng: ");
            System.out.println("==> ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap id moi: ");
                    int newId = input.nextInt();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
            }
        }while (choice!=0);


    }

    public void remove(){

    }

    public void display(){

    }

    public void searchByName(){

    }

    public void sortIncreaseByPrice(){

    }

    public void sortDecreaseByPrice(){

    }



    public void mainMenu(){
        do{
            System.out.println();
            System.out.println("====MAIN MENU====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("9. Thoát");
            System.out.println("\nChon chuc nang");
            System.out.println("==> ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    sortIncreaseByPrice();
                    break;
                case 7:
                    sortDecreaseByPrice();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }


}
