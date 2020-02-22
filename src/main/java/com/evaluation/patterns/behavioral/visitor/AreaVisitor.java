package com.evaluation.patterns.behavioral.visitor;

public class AreaVisitor implements Visitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Area of circle = " + Math.PI * Math.pow(circle.getRadius(), 2));
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Area of square = " + 4 * square.getSide());
    }
}
