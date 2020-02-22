package com.evaluation.patterns.behavioral.state;

public class Reading implements State {

    @Override
    public void doAction() {
        System.out.println("Read book");
    }
}
