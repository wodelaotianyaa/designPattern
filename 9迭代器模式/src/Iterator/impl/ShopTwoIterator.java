package Iterator.impl;

import Iterator.Iterator;
import pojo.MenuItem;

public class ShopTwoIterator implements Iterator {
    MenuItem[] items;
    int position=0;

    public ShopTwoIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>= items.length || items[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
