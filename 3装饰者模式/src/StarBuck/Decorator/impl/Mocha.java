package StarBuck.Decorator.impl;

import StarBuck.Beverage;
import StarBuck.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }

    @Override
    public String getDescription() {
        description= beverage.getDescription()+",Mocha";
        //System.out.println(description);
        return  description;
    }
}
