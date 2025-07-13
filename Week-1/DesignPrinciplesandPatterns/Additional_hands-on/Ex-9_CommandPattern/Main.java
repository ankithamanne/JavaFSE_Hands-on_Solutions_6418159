interface Command {
    void execute();
}
class Light {
    void on() { System.out.println("Light ON"); }
}
class LightOnCommand implements Command {
    Light light;
    LightOnCommand(Light l) { light = l; }
    public void execute() { light.on(); }
}
class RemoteControl {
    Command command;
    void setCommand(Command c) { command = c; }
    void pressButton() { command.execute(); }
}
public class Main {
    public static void main(String[] args) {
        Light l = new Light();
        RemoteControl r = new RemoteControl();
        r.setCommand(new LightOnCommand(l));
        r.pressButton();
    }
}