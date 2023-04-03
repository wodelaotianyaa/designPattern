package pojo.impl;

import pojo.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    String name;

    String description;

    ArrayList<MenuComponent> items;

    public Menu(String name, String description) {
        items = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        items.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        items.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesciption() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getDesciption());
        System.out.println("--------------------------");

        Iterator iterator = items.iterator();
        while(iterator.hasNext()){
            MenuComponent next = (MenuComponent)iterator.next();
            next.print();
        }
    }
}
