import Command.Command;
import Command.impl.NoCommand;

public class RemoteControl {
    Command[] onCommands;

    Command[] offCommands;

    Command lastCommand ;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand = new NoCommand();
        lastCommand = noCommand;
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void pressOn(int slot){
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }
    public void pressOff(int slot){
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }
    public void undoPush(){
        lastCommand.undo();
    }

}
