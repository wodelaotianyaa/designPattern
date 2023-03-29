package PizzaStoreSimulator;

import PizzaStoreSimulator.pojo.ChicagoCheesePizza;
import PizzaStoreSimulator.pojo.NYCheesePizza;
import PizzaStoreSimulator.pojo.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if("CHESS".equals(type)){
            return new ChicagoCheesePizza();
        }
        return null;
    }
}
