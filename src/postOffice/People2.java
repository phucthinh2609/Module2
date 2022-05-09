package postOffice;

public class Mailbox2 implements Observer{

    @Override
    public void updateMessage(String message) {
        System.out.println("Mailbox2 received: "+message);
    }
}
