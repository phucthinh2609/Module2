package Kteam;

public class Helloworld3 {
    public static void main(String[] args) {
        Person3 a = new Person3("Thinh", 19, 7.5f);
        System.out.println(a);
        System.out.println(a.getInstance());
        Person3 b = a;
        System.out.println(b);
        Person3 c = a.getInstance();
        System.out.println(c);

    }
}
