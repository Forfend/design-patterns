package com.evaluation.patterns.creational.builder;

public interface Builder {

    void builder();

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setEmail(String email);

    void setAge(int age);

    void setGender(Gender gender);

    void setMarried(boolean isMarried);

    void setHasChildren(boolean hasChildren);

    User build();

}
