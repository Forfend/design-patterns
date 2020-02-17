package com.evaluation.patterns.behavioral.chain;

public class EmailNotifier implements Notifier {

    private Notifier nextNotifier;
    private Priority priority;

    public EmailNotifier(Priority priority) {
        this.priority = priority;
    }

    @Override
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void handleRequest(int level) {
        if (level >= priority.getId()) {
            System.out.println("Sending email...");
        }

        if (nextNotifier != null) {
            nextNotifier.handleRequest(level);
        }
    }
}
