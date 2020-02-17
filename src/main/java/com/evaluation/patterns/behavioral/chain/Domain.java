package com.evaluation.patterns.behavioral.chain;

public class Domain {

    public static void main(String[] args) {
        Notifier report = new ReportNotifier(Priority.OK);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.CRITICAL);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.handleRequest(1);
        report.handleRequest(2);
        report.handleRequest(3);
    }
}
