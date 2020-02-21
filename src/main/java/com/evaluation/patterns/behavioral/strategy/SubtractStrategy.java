package com.evaluation.patterns.behavioral.strategy;

public class SubtractStrategy implements Strategy{

    @Override
    public void execute(int a, int b) {
        System.out.println("Subtract strategy: " + a + " - " + b + " = " + (a - b));
    }
}
