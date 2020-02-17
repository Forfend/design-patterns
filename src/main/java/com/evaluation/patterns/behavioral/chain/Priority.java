package com.evaluation.patterns.behavioral.chain;

public enum Priority {
    OK(1),
    IMPORTANT(2),
    CRITICAL(3);

    private int id;

    Priority(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
