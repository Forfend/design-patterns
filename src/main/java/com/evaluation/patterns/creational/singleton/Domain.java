package com.evaluation.patterns.creational.singleton;

public class Domain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();

        logger.log("Study GoF Patterns");
        logger.log("This is a singleton pattern");
        logger.log("Belongs to creation group");

        logger.readLogs();

        Logger secondLogger = Logger.getLogger();
        secondLogger.readLogs();
        System.out.println(logger == secondLogger);
    }
}
