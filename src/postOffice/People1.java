package postOffice;

public class Mailbox1 implements Observer{
    @Override
    public void updateMessage(String message) {
        System.out.println("Mailbox1 received: "+message);
    }
}
