package org.example.basics;

import java.util.Objects;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class ObjectMethods {
    public static void main(String[] args) {
        getInfo();
    }

    private static void getInfo() {
        Dog dog = new Dog("Bob");
        Cat cat = new Cat("Molly");

        System.out.println("To string: " + dog.toString());
        System.out.println("Hash code is " + dog.hashCode());
        System.out.println(dog.equals(cat));
        System.out.println("Class is " + dog.getClass());
        System.out.println(dog.hashCode() == cat.hashCode());
    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               '}';
    }
}
