package CaffineBeverage.impl;

import CaffineBeverage.CaffineBaverage;

public class Tea extends CaffineBaverage {
    @Override
    public void brew() {
        System.out.println("ADD TEA");
    }

    @Override
    protected void addCondiments() {
        System.out.println("ADD TEAWATER");
    }
}
