package com.evaluation.patterns.behavioral.strategy;

public class Domain {
    public static void main(String[] args) {
        Strategy add = new AddStrategy();
        Strategy subtract = new SubtractStrategy();
        Strategy multiply = new MultiplyStrategy();

        int a = 2;
        int b = 4;

        Context context = new Context(add);
        context.execute(a, b);
        context.setStrategy(subtract);
        context.execute(a, b);
        context.setStrategy(multiply);
        context.execute(a, b);
    }
}
