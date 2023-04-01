import Adapter.TurkeyAdapter;
import pojo.Duck;
import pojo.Turkey;
import pojo.impl.GreenHeadDuck;
import pojo.impl.RedTurkey;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new GreenHeadDuck();
        Turkey t1 = new RedTurkey();

        d1.quack();
        d1.fly();

        t1.yeal();
        t1.move();

        Duck d2 = new TurkeyAdapter(t1);
        d2.quack();
        d2.fly();
    }
}