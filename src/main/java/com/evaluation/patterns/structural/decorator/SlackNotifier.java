package com.evaluation.patterns.structural.decorator;

public class SlackNotifier implements Notifier {

    @Override
    public void sendMessage() {
        System.out.println("Slack notifier");
    }
}
