package com.evaluation.patterns.creational.builder;

public class Domain {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        userBuilder.builder();
        userBuilder.setFirstName("John");
        userBuilder.setLastName("Doe");
        userBuilder.setEmail("john.doe@gmail.com");
        userBuilder.setAge(21);
        userBuilder.setGender(Gender.MALE);
        userBuilder.setMarried(false);
        userBuilder.setHasChildren(false);

        User user = userBuilder.build();
        System.out.println(user);

    }
}
