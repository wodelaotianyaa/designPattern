package StarBuck.Decorator.impl;

import StarBuck.Beverage;
import StarBuck.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public double cost() {
        return beverage.cost()+0.4;
    }

    @Override
    public String getDescription() {
        description= beverage.getDescription()+",Whip";
        //System.out.println(description);
        return description;
    }
}
