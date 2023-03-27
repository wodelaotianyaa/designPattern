package DuckSimulator.Animal;

import DuckSimulator.Behavior.impl.FlyNoWay;
import DuckSimulator.Behavior.impl.MuteQuack;

public class YellowDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是小黄鸭");
    }

    public YellowDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
