package pojo.impl;

import pojo.MenuComponent;


public class MenuItem extends MenuComponent {
    public String name;
    public String desciption;
    public boolean vegetarian;
    public  double price;

    public MenuItem(String name, String desciption, boolean vegetarian, double price) {
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesciption() {
        return desciption;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
