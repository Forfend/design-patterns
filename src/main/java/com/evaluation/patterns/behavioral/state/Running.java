package com.evaluation.patterns.behavioral.state;

public class Running implements State {

    @Override
    public void doAction() {
        System.out.println("Running");
    }

}
