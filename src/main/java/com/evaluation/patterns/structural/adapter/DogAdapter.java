package com.evaluation.patterns.structural.adapter;

public class DogAdapter extends Wolf {

    private Dog biggle;

    public DogAdapter(Dog biggle) {
        this.biggle = biggle;
    }

    @Override
    void howl() {
        biggle.bark();
    }
}
