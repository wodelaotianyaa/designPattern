package Command.impl;

import Command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        //空实现
    }

    @Override
    public void undo() {

    }
}
