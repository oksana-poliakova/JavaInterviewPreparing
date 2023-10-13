package org.example.basics;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Immutable {
    public static void main(String[] args) {
        use();
        testStrings();
    }

    public static void use() {
        TestPerson testPerson1 = new TestPerson("Alice", 22);

        /** It won't work, because this object is immutable and when we want to change the name, we need
         * to create a new object */

//        person1.setName("Bob");
//        System.out.println(person1.name); // Immutable
//        Person newPerson = new Person("Bob", person1.age);

        TestPerson testPerson2 = new TestPerson("Bob", testPerson1.getAge());

        System.out.println(testPerson2.getName());
        System.out.println(testPerson2.getAge());
    }

    public static void testStrings() {
        String someString = "Old Text";
        System.out.println(someString.hashCode());
        System.out.println("Original string is - " + someString);

        someString = "New text";
        System.out.println("New string is - " + someString);
        System.out.println(someString.hashCode());
    }
}

