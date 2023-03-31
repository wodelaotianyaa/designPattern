package Command.impl;

import Command.Command;
import pojo.CeilingFan;
import pojo.Light;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
    @Override
    public void undo() {
        ceilingFan.off();
    }
}
