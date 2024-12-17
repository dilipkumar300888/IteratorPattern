package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;
    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }
    void printMenu() {
        System.out.println("MENU");
        System.out.println("----");
        for(Menu menu : menus) {
            System.out.println(menu.getClass().getName());
            Iterator iterator = menu.createIterator();
            printMenu(iterator);
            System.out.println();
        }
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription() + ", ");
        }
    }

}
