package com.evaluation.patterns.behavioral.visitor;

public interface Visitor {

    void visitCircle(Circle circle);

    void visitSquare(Square square);
}
