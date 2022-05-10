package postOffice;

public class People2 implements Observer{

    @Override
    public void updateMessage(String message) {
        System.out.println("People2 received: "+message);
    }
}
