package Command.impl;

import Command.Command;
import pojo.GarbageDoor;

public class GarbageDoorOffCommand implements Command {
    GarbageDoor garbageDoor;

    public GarbageDoorOffCommand(GarbageDoor garbageDoor) {
        this.garbageDoor = garbageDoor;
    }

    @Override
    public void execute() {
        garbageDoor.off();
    }
    @Override
    public void undo() {
        garbageDoor.on();
    }
}
