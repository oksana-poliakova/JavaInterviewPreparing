package org.example.basics;

/** This is the immutable object: public final class and fields, only getters */
public final class TestPerson {
    private final String name;
    private final Integer age;

    public TestPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
