package com.evaluation.patterns.creational.abstractfactory;

public class JavaFactory implements AbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Automation createAutomationEngineer() {
        return new JavaAutomationEngineer();
    }
}
