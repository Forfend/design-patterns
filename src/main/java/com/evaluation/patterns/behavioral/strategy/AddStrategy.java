package com.evaluation.patterns.behavioral.strategy;

public class AddStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println("Add strategy: " + a + " + " + b + " = " + (a + b));
    }
}
