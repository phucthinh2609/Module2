package postOffice;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        Observer mailbox1 = new People1();
        postOffice.addObserver(mailbox1);

        Observer mailbox2 = new People2();
        postOffice.addObserver(mailbox2);
//        postOffice.removeObserver(mailbox2);

        postOffice.newMail("Hello");
        postOffice.notifyObserver();
    }
}
