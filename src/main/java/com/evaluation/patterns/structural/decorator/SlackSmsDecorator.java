package com.evaluation.patterns.structural.decorator;

public class SlackSmsDecorator extends BaseDecorator {

    public SlackSmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Sms notifier");
    }
}
