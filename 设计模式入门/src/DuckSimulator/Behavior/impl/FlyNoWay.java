package DuckSimulator.Behavior.impl;

import DuckSimulator.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("俺不会飞");
    }
}
