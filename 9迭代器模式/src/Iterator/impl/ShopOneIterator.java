package Iterator.impl;

import Iterator.Iterator;
import pojo.MenuItem;

import java.util.ArrayList;

public class ShopOneIterator implements Iterator {
    ArrayList<MenuItem> items;

    int position=0;

    public ShopOneIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem= items.get(position);
        position++;
        return menuItem;
    }
}
