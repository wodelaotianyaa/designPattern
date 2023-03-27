package DuckSimulator.Behavior.impl;

import DuckSimulator.Behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("guagua~");
    }
}
