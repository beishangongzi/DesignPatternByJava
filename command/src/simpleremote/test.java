package simpleremote;



public class test {
    public static void main(String[] args) {
        Simpleremote simpleremote = new Simpleremote();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleremote.setCommand(lightOffCommand);
        simpleremote.buttonWasPressed();
        simpleremote.setCommand(garageDoor::up);
        simpleremote.buttonWasPressed();
    }
}
