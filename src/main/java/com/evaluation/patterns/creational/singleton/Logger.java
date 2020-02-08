package com.evaluation.patterns.creational.singleton;

public class Logger {
    private static Logger logger;

    private StringBuilder logs;

    private Logger() {
        logs = new StringBuilder();
    }

    public static synchronized Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        logs.append(message).append("\n");
    }

    public void readLogs() {
        System.out.println(logs);
    }
}
