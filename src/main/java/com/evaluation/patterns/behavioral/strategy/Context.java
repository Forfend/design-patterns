package com.evaluation.patterns.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int a, int b) {
        strategy.execute(a, b);
    }
}

