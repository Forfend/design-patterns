package com.evaluation.patterns.behavioral.memento;

public class Domain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Version 1.0");
        originator.setState("Version 1.1");

        careTaker.add(originator.saveToMemento());

        originator.setState("Version 2.0");
        careTaker.add(originator.saveToMemento());

        originator.setState("Version 3.0");

        System.out.println("Current state " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));

        System.out.println("First saved state " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state " + originator.getState());
    }
}
