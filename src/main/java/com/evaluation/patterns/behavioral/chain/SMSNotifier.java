package com.evaluation.patterns.behavioral.chain;

public class SMSNotifier implements Notifier {

    private Notifier nextNotifier;
    private Priority priority;

    public SMSNotifier(Priority priority) {
        this.priority = priority;
    }

    @Override
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void handleRequest(int level) {
        if (level >= priority.getId()) {
            System.out.println("Sending SMS...");
        }

        if (nextNotifier != null) {
            nextNotifier.handleRequest(level);
        }
    }
}
