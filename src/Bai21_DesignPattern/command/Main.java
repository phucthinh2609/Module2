package Bai21_DesignPattern.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();
        ICommand command = new TurnOnCommand(light);
        control.setCommand(command);
        control.pressButton();

        System.out.println(light);

        command = new TurnOffCommand(light);
        control.setCommand(command);
        control.pressButton();

        System.out.println(light);
    }
}
