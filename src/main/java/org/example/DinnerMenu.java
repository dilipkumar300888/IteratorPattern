package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class DinnerMenu implements Menu {
    ArrayList<MenuItem> menuItems;
    public DinnerMenu() {
        menuItems = new ArrayList<>();
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
        addItem("A hot dog","A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name,description,vegetarian,price));
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
