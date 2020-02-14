package com.evaluation.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final String JAVA_DEVELOPER = "java";
    private static final String PYTHON_DEVELOPER = "python";
    private static Map<String, Developer> developerMap;

    public DeveloperFactory() {
        developerMap = new HashMap<>();
    }

    public Developer getDeveloper(String specialty) {
        Developer developer = developerMap.get(specialty);
        if (developer == null && specialty.equalsIgnoreCase(JAVA_DEVELOPER)) {
            developer = new JavaDeveloper();
            System.out.println("Creating " + specialty + " developer");
        } else if (developer == null && specialty.equalsIgnoreCase(PYTHON_DEVELOPER)) {
            developer = new PythonDeveloper();
            System.out.println("Creating " + specialty + " developer");
        }
        developerMap.put(specialty, developer);

        return developer;
    }

    public int getSize() {
        return developerMap.size();
    }
}
