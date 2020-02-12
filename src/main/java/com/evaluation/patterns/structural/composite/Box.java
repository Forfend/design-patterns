package com.evaluation.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<Item> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int getSum() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }
}
