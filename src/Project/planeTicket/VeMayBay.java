package Project.PlaneTicket;

import java.util.Scanner;

public class VeMayBay {
    String id;
    String name;
    String date;
    String bag;
    int price;

    public VeMayBay(String id, String name, String date, String bag, int price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.bag = bag;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma ve: ");
        int id = scanner.nextInt();

        System.out.println("Nhap ten may bay: ");
        String name = scanner.nextLine();

        System.out.println("Nhap ngay bay: ");
        String date = scanner.nextLine();

        System.out.println("Nhap hanh ly ky gui: ");
        String bag = scanner.nextLine();

        System.out.println("Nhap gia bay: ");
        int price = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "VeMayBay{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", bag='" + bag + '\'' +
                 ", price=" + price +
                '}';
    }

    public void display(){

    }
}
