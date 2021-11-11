package simpleremoteWL;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleremoteWL remote = new SimpleremoteWL();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        remote.setCommand(light::on);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::lightOn);
        remote.buttonWasPressed();

    }
}
