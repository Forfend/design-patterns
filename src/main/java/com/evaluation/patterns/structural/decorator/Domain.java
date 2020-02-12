package com.evaluation.patterns.structural.decorator;

public class Domain {

    public static void main(String[] args) {
        Notifier slack = new SlackNotifier();

        BaseDecorator decorator = new BaseDecorator(slack);
        decorator.sendMessage();

        BaseDecorator smsSlack = new SlackSmsDecorator(slack);
        smsSlack.sendMessage();
    }
}
