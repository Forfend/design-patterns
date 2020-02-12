package com.evaluation.patterns.structural.decorator;

public class SmsNotifier implements Notifier {

    @Override
    public void sendMessage() {
        System.out.println("SMS notification");
    }
}
