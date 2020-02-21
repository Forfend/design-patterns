package com.evaluation.patterns.behavioral.strategy;

public class MultiplyStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println("Multiply strategy: " + a + " * " + b + " = " + a * b);
    }
}
