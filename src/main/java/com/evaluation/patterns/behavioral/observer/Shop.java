package com.evaluation.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Observer{

    private List<Subscriber> users;
    private List<String> items;

    public Shop() {
        users = new ArrayList<>();
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        notifySubscribers();
    }

    public void removeItem(String item){
        items.remove(item);
        notifySubscribers();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        users.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        users.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : users){
            subscriber.handleEvent(items);
        }
    }
}
