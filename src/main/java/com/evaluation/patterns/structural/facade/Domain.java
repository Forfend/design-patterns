package com.evaluation.patterns.structural.facade;

public class Domain {

    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        facade.drawCircle();
        facade.drawTriangle();
        facade.drawSquare();
    }
}
