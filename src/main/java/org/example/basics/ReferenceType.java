package org.example.basics;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class ReferenceType {
    public static void main(String[] args) {
        Dog dog = new Dog("Molly");
        changeName(dog);

        //hello
        System.out.println(dog.getName()); // Bella
    }

    /** We pass a reference to the Object Dog. Any changes have influence to the original object. */
    public static void changeName(Dog dog) {
        dog.setName("Bella");
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
