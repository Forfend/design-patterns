package com.evaluation.patterns.behavioral.mediator;

public class Domain {
    public static void main(String[] args) {
        ComponentOne one = new ComponentOne();
        ComponentTwo two = new ComponentTwo();
        new ConcreteMediator(one, two);


        one.doA();
        one.doB();
        two.doC();
        two.doD();
    }
}
