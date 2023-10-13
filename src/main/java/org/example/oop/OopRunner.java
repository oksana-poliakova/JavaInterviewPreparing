package org.example.oop;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public final class OopRunner {
    public static void main(String[] args) {
        Person person = new Person("Maria", 25);
        person.introduce();

        person.setName("Anna");
        person.setAge(21);
        person.introduce();

        Person person1 = new Person("Anna", 34);
        person1.introduce();

        Teacher teacher1 = new Teacher("Teacher Smith", 42);
        teacher1.introduce();
        teacher1.teach();
        teacher1.sayHello();

        Student student1 = new Student("John Dou", 19);
        student1.study();
        student1.saySomething();
        student1.sayHello();
    }
}
