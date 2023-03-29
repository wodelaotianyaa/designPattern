package PizzaStoreSimulator.pojo;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("prepare++"+name);
    }
    public void bake(){
        System.out.println("bake");
    }
    public void cut(){
        System.out.println("Cut");
    }
    public void box(){
        System.out.println("box");
    }
    public String getName(){
        return name;
    }
}
