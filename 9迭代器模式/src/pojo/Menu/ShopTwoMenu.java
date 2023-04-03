package pojo.Menu;

import Iterator.Iterator;
import Iterator.impl.ShopTwoIterator;
import pojo.MenuItem;

import java.util.ArrayList;

public class ShopTwoMenu {

    public final int MAX_INTEMS = 6;
    public int numberOfItmes=0;
    MenuItem[] menuItems;

    public ShopTwoMenu() {
        this.menuItems = new MenuItem[MAX_INTEMS];
        addItems("s21","aaa",true,0.1);
        addItems("s22","baa",true,0.1);
        addItems("s23","caa",false,0.1);
        addItems("s24","daa",true,0.1);
    }
    public void addItems(String name,String des,boolean v,double p){
        MenuItem menuItem = new MenuItem(name,des,v,p);
        if(numberOfItmes>=MAX_INTEMS){
            System.out.println("ERR");
        }else{
            menuItems[numberOfItmes]=menuItem;
            numberOfItmes++;
        }
    }
    public Iterator createIterator(){
        return new ShopTwoIterator(menuItems);
    }
}
