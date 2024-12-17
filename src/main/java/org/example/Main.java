package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Menu> menuList = new ArrayList<>();
        Menu menu = new BreakfastMenu();
        Menu menu1 = new DinnerMenu();
        Menu menu2 = new LunchMenu();
        menuList.add(menu);
        menuList.add(menu1);
        menuList.add(menu2);
        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();

    }
}