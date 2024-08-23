package design.pattern.command;

public class RemoteControl {
    Command [] onCommands;
    Command [] offCommands;

    public RemoteControl(int slots) {
        onCommands = new Command[7];
        offCommands = new Command[7];


        for (int i = 0; i < 7; i++) {
            onCommands[i] = null;
            offCommands[i] = null;

        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }
    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }
    public void undoButtonWasPressed() {

    }
}
