package com.evaluation.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Domain {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>(Arrays.asList("Java", "Spring", "Docker", "AWS"));
        JavaDeveloper javaDeveloper = new JavaDeveloper("John Doe", skills);

        Iterator<String> iterator = javaDeveloper.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
