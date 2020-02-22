package com.evaluation.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Domain {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Circle(2));
        elements.add(new Circle(3));
        elements.add(new Circle(4));
        elements.add(new Square(2));
        elements.add(new Square(4));
        elements.add(new Square(6));

        Visitor area = new AreaVisitor();

        for (Element element : elements) {
            element.accept(area);
        }

    }
}
