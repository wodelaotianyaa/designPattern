package pojo.impl;

import pojo.Turkey;

public class RedTurkey implements Turkey {
    @Override
    public void yeal() {
        System.out.println("yeal");
    }

    @Override
    public void move() {
        System.out.println("move");
    }
}
