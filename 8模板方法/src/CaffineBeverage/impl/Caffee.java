package CaffineBeverage.impl;

import CaffineBeverage.CaffineBaverage;

public class Caffee extends CaffineBaverage {
    @Override
    public void brew() {
        System.out.println("Add Tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add lemon");
    }
}
