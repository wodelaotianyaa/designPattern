package PizzaStoreSimulator;

import PizzaStoreSimulator.pojo.NYCheesePizza;
import PizzaStoreSimulator.pojo.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if("CHESS".equals(type)){
            return new NYCheesePizza();
        }
        return null;
    }
}
