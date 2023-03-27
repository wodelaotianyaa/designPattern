package DuckSimulator;

import DuckSimulator.Animal.Duck;
import DuckSimulator.Animal.YellowDuck;
import DuckSimulator.Behavior.impl.FlyWithRocket;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck d1 = new YellowDuck();
        d1.fly();
        d1.quack();

        d1.setFlyBehavior(new FlyWithRocket());

        d1.fly();
    }
}
