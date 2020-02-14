package com.evaluation.patterns.structural.flyweight;

public class Domain {
    private static final String JAVA_DEVELOPER = "java";
    private static final String PYTHON_DEVELOPER = "python";

    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        for (int i = 0; i < 25; i++) {
            Developer javaDeveloper = factory.getDeveloper(JAVA_DEVELOPER);
            Developer pythonDeveloper = factory.getDeveloper(PYTHON_DEVELOPER);

            javaDeveloper.writeCode();
            pythonDeveloper.writeCode();
        }
        System.out.println(factory.getSize());
    }
}
