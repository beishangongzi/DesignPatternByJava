package simpleremoteWL;

public class SimpleremoteWL {
    Command slot;

    public SimpleremoteWL() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
