package com.evaluation.patterns.behavioral.observer;

public interface Observer {

    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void notifySubscribers();
}
