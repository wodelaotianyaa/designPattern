package pojo;

import pojo.State;
import pojo.impl.HasQuarterState;
import pojo.impl.NoQuarterState;
import pojo.impl.SoldOutState;
import pojo.impl.SoldState;

public class GumballMachine {
    State soldOutState;
    State soldState;
    State noQuarterState;
    State hasQuarterState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int i) {
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        count = i;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dipense();
    }

    public void releaseBall() {
        System.out.println("发放糖果");
        if (count > 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }
}
