package pojo.impl;

import pojo.GumballMachine;
import pojo.State;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请等待");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("不可退");
    }

    @Override
    public void turnCrank() {
        System.out.println("请等待");
    }

    @Override
    public void dipense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            System.out.println("状态变化为————>\n"+gumballMachine.toString());
        }else{
            System.out.println("没有多余糖果");
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("状态变化为————>\n"+gumballMachine.toString());
        }
    }
}
