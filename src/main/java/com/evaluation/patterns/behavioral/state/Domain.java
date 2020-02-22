package com.evaluation.patterns.behavioral.state;

public class Domain {
    public static void main(String[] args) {
        State sleep = new Sleeping();
        Context context = new Context();
        context.setState(sleep);

        for (int i = 0; i < 5; i++) {
            context.doAction();
            context.changeState();
        }

    }
}
