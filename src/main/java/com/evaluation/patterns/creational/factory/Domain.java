package com.evaluation.patterns.creational.factory;

public class Domain {

    public static void main(String[] args) {
        AnimalFactory factory = createFactory(Animals.CAT.getKind());
        Animal cat = factory.createAnimal();
        cat.say();
    }

    private static AnimalFactory createFactory(String animal) {
        if (animal.equalsIgnoreCase("cat")) {
            return new CatFactory();
        }

        if (animal.equalsIgnoreCase("dog")){
            return new DogFactory();
        }

        throw new IllegalArgumentException(animal + " is unknown animal.");
    }
}
