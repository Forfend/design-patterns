package com.evaluation.patterns.behavioral.mediator;

public class ConcreteMediator implements Mediator {

    private ComponentOne componentOne;
    private ComponentTwo componentTwo;

    public ConcreteMediator(ComponentOne componentOne, ComponentTwo componentTwo) {
        this.componentOne = componentOne;
        this.componentOne.setMediator(this);
        this.componentTwo = componentTwo;
        this.componentTwo.setMediator(this);
    }

    @Override
    public void notify(Object sender, String event) {
        if (event.equalsIgnoreCase("a")) {
            System.out.println("Mediator reacts on event A");
            this.componentTwo.doC();
        }

        if (event.equalsIgnoreCase("d")) {
            System.out.println("Mediator reacts on event D");
            this.componentOne.doB();
            this.componentTwo.doC();
        }
    }
}
