package com.evaluation.patterns.behavioral.iterator;

public class SkillsIterator implements Iterator<String>{
    private JavaDeveloper developer;
    private int index;

    public SkillsIterator(JavaDeveloper developer) {
        this.developer = developer;
    }

    @Override
    public boolean hasNext() {
        return index < developer.getSkills().size();
    }

    @Override
    public String next() {
        return developer.getSkills().get(index++);
    }
}
