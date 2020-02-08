package com.evaluation.patterns.creational.abstractfactory;

public interface AbstractFactory {
    Developer createDeveloper();
    Automation createAutomationEngineer();
}
