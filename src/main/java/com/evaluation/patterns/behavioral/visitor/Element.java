package com.evaluation.patterns.behavioral.visitor;

public interface Element {

    void accept(Visitor visitor);
}
