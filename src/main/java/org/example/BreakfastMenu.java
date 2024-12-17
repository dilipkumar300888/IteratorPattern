package org.example;

import java.lang.reflect.Array;
import java.util.Iterator;

public class BreakfastMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public BreakfastMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles, with your choice of blueberries or strawberries",true,3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if(numberOfItems < MAX_ITEMS) {
            menuItems[numberOfItems] = new MenuItem(name,description,vegetarian,price);
            numberOfItems++;
        }
        else {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        }
    }

    @Override
    public Iterator createIterator() {
        return new BreakMenuIterator(menuItems);
    }
}
