package Bai21_DesignPattern.command;

public class TurnOffCommand implements ICommand {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
