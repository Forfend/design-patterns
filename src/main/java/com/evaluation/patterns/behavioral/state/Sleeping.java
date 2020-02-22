package com.evaluation.patterns.behavioral.state;

public class Sleeping implements State {

    @Override
    public void doAction() {
        System.out.println("Sleeping");
    }

}
