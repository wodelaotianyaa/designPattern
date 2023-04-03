package pojo.Menu;

import Iterator.Iterator;
import Iterator.impl.ShopOneIterator;
import pojo.MenuItem;

import java.util.ArrayList;

public class ShopOneMenu {
    ArrayList<MenuItem> menuItems;

    public ShopOneMenu() {
        this.menuItems = new ArrayList<>();
        addItems("s11","aaa",true,0.1);
        addItems("s12","baa",true,0.1);
        addItems("s13","caa",false,0.1);
        addItems("s14","daa",true,0.1);
    }
    public void addItems(String name,String des,boolean v,double p){
        MenuItem menuItem = new MenuItem(name,des,v,p);
        menuItems.add(menuItem);
    }
    public Iterator createIterator(){
        return  new ShopOneIterator(menuItems);
    }
}
