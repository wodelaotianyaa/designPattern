package StarBuck;

import StarBuck.Decorator.impl.Mocha;
import StarBuck.Decorator.impl.Whip;

public class StarBuckSimulator {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.display());

        Beverage beverage1 = new Mocha(beverage);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.display());
    }
}
