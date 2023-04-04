package pojo.impl;

import pojo.GumballMachine;
import pojo.State;


public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("无余货");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无余货");
    }

    @Override
    public void turnCrank() {
        System.out.println("无余货");
    }

    @Override
    public void dipense() {
        System.out.println("无余货");
    }
}
