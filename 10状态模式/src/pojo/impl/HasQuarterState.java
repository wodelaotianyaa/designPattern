package pojo.impl;

import pojo.GumballMachine;
import pojo.State;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("已投币，无需再投");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("状态变化为————>\n"+gumballMachine.toString());
    }

    @Override
    public void turnCrank() {
        System.out.println("转动手柄");
        gumballMachine.setState(gumballMachine.getSoldState());
        System.out.println("状态变化为————>\n"+gumballMachine.toString());
    }

    @Override
    public void dipense() {
        System.out.println("请转动手柄");
    }
}
