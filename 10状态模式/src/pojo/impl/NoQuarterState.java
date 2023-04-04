package pojo.impl;

import pojo.GumballMachine;
import pojo.State;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("投入一枚硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("状态变化为————>\n"+gumballMachine.toString());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("未投币");
    }

    @Override
    public void turnCrank() {
        System.out.println("未投币");
    }

    @Override
    public void dipense() {
        System.out.println("未投币");
    }
}
