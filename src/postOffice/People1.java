package postOffice;

public class People1 implements Observer{

    @Override
    public void updateMessage(String message) {
        System.out.println("People1 received: "+message);
    }
}
