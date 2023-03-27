package DuckSimulator.Behavior.impl;

import DuckSimulator.Behavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("做火箭飞行~！");
    }
}
