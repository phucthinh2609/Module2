package Bai21_DesignPattern.facade;

public class TwisterShare implements IShare{
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        ///Complicated.....
        System.out.println("Sharing to Twister: "+message);
    }
}
