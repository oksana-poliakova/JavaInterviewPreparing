package org.example.basics;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Immutable {
    public static void main(String[] args) {
        use();
    }

    public static void use() {
        Person person1 = new Person("Alice", 22);

        /** It won't work, because this object is immutable and when we want to change the name, we need
         * to create a new object */

//        person1.setName("Bob");
//        System.out.println(person1.name); // Immutable
//        Person newPerson = new Person("Bob", person1.age);

        Person person2 = new Person("Bob", person1.getAge());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}

