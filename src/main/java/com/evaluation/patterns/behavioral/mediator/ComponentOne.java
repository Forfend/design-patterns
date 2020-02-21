package com.evaluation.patterns.behavioral.mediator;

public class ComponentOne {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doA() {
        System.out.println("Component 1 does A");
        this.mediator.notify(this, "A");
    }

    public void doB() {
        System.out.println("Component 1 does B");
        this.mediator.notify(this, "B");
    }

}
