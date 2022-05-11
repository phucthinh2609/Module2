package Bai10_ArrayList_LinkedList.productManager;

import java.util.Scanner;

public class Product {
    static int count = 0;
    int id = 0;
    String name;
    float price;

    public Product() {
        id = ++count;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sản phẩm: ");
        name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        price = Float.parseFloat(scanner.nextLine());
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
