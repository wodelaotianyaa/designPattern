package DuckSimulator.Behavior.impl;

import DuckSimulator.Behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
