package com.evaluation.patterns.structural.facade;

public class ShapeFacade {
    private Shape circle;
    private Shape triangle;
    private Shape square;

    public ShapeFacade() {
        circle = new Circle();
        triangle = new Triangle();
        square = new Square();
    }

    void drawCircle() {
        circle.draw();
    }

    void drawTriangle() {
        triangle.draw();
    }

    void drawSquare() {
        square.draw();
    }
}
