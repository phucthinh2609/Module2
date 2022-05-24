package Project.planeTicket;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VeMayBay implements Serializable {
    String id;
    String name;
    String date;
    String bag;
    int price;

    public VeMayBay() {
    }

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

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã vé: ");
        while (true) {
            id = scanner.nextLine();
            String  pattermStr = "((VJ[1-9]{1}[0-9]{2})|(VN[1-9]{1}[0-9]{2}[0-9]?)|(JS[1-9]{1}[0-9]{2}))";

            Pattern pattern = Pattern.compile(pattermStr);
            Matcher matcher = pattern.matcher(id);

            if (matcher.find())
                break;
            else
                System.err.println("Nhập lại!!!");
        }

        System.out.println("Nhập tên máy bay: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày bay: ");
        String date = scanner.nextLine();

        System.out.println("Nhập hành lý ký gửi: ");
        String bag = scanner.nextLine();

        System.out.println("Nhập giá máy bay: ");
        price = Integer.parseInt(scanner.nextLine());
    }

    public void display() {
        System.out.println(toString());
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
}
