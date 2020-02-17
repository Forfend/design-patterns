package com.evaluation.patterns.behavioral.chain;

public interface Notifier {

    void setNextNotifier(Notifier nextNotifier);

    void handleRequest(int level);
}
