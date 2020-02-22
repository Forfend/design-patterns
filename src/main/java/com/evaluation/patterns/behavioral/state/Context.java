package com.evaluation.patterns.behavioral.state;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof Sleeping) {
            setState(new Running());
        } else if (state instanceof Running) {
            setState(new Reading());
        } else if (state instanceof Reading) {
            setState(new Sleeping());
        }
    }

    public void doAction() {
        state.doAction();
    }
}
