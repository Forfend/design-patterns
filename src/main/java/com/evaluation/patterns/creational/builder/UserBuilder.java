package com.evaluation.patterns.creational.builder;

public class UserBuilder implements Builder {
    private User user;

    @Override
    public void builder() {
        user = new User();
    }

    @Override
    public void setFirstName(String firstName) {
        user.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        user.setLastName(lastName);
    }

    @Override
    public void setEmail(String email) {
        user.setEmail(email);
    }

    @Override
    public void setAge(int age) {
        user.setAge(age);
    }

    @Override
    public void setGender(Gender gender) {
        user.setGender(gender);
    }

    @Override
    public void setMarried(boolean isMarried) {
        user.setMarried(isMarried);
    }

    @Override
    public void setHasChildren(boolean hasChildren) {
        user.setHasChildren(hasChildren);
    }

    @Override
    public User build() {
        return this.user;
    }
}
