package com.evaluation.patterns.behavioral.mediator;

public class ComponentTwo {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doC() {
        System.out.println("Component 2 does C");
        this.mediator.notify(this, "C");
    }

    public void doD() {
        System.out.println("Component 2 does D");
        this.mediator.notify(this, "D");
    }
}
