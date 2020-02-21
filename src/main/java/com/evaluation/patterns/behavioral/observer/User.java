package com.evaluation.patterns.behavioral.observer;

import java.util.List;

public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> items) {
        System.out.println(this.name + " New items:" + items +
                "\n====================================\n");
    }
}
