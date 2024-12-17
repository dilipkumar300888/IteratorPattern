package org.example;

import java.util.Iterator;

public class BreakMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;
    public BreakMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
