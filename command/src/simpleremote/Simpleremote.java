package simpleremote;

public class Simpleremote {
    simpleremote.Command slot;

    public Simpleremote() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
