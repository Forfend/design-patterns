package com.evaluation.patterns.behavioral.observer;

import java.util.List;

public interface Subscriber {

    void handleEvent(List<String> items);
}
