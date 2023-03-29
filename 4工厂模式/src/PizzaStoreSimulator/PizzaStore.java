package PizzaStoreSimulator;

import PizzaStoreSimulator.pojo.Pizza;

import java.util.ArrayList;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
