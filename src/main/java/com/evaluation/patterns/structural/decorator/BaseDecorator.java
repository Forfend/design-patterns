package com.evaluation.patterns.structural.decorator;

public class BaseDecorator implements Notifier{
    protected Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendMessage() {
        notifier.sendMessage();
    }
}
