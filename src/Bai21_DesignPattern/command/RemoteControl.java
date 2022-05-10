package Bai21_DesignPattern.command;

public class RemoteControl {
    private ICommand command;

    public RemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
    }
}
