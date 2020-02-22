package com.evaluation.patterns.behavioral.visitor;

public class Square implements Element{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }
}
