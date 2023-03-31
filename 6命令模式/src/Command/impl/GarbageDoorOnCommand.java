package Command.impl;

import Command.Command;
import pojo.CeilingFan;
import pojo.GarbageDoor;

public class GarbageDoorOnCommand implements Command {
    GarbageDoor garbageDoor;

    public GarbageDoorOnCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        garbageDoor.on();
    }
    @Override
    public void undo() {
        garbageDoor.off();
    }
}
