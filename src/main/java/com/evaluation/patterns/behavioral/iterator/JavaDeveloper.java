package com.evaluation.patterns.behavioral.iterator;

import java.util.List;

public class JavaDeveloper implements Collection {
    private String name;
    private List<String> skills;
    private Iterator<String> iterator;

    public JavaDeveloper(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public Iterator<String> getIterator() {
        return new SkillsIterator(this);
    }
}
