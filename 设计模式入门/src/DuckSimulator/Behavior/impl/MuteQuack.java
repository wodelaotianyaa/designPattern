package DuckSimulator.Behavior.impl;

import DuckSimulator.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("俺不会叫~");
    }
}
