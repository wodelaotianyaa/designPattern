package DuckSimulator.Animal;

import DuckSimulator.Behavior.FlyBehavior;
import DuckSimulator.Behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("all duck swim");
    }

    public abstract void display();
}
