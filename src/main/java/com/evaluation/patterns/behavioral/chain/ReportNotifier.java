package com.evaluation.patterns.behavioral.chain;

public class ReportNotifier implements Notifier {

    private Notifier nextNotifier;
    private Priority priority;

    public ReportNotifier(Priority priority) {
        this.priority = priority;
    }

    @Override
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void handleRequest(int level) {
        if (level >= priority.getId()) {
            System.out.println("Generating Report...");
        }

        if (nextNotifier != null) {
            nextNotifier.handleRequest(level);
        }
    }
}
