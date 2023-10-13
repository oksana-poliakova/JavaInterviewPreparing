package org.example.oop;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Student extends Person implements SayHello {
    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        super.introduce();
    }

    public void study() {
        System.out.println("I'm a student and I'm studying");
    }

    @Override
    public void saySomething() {
        System.out.println("I like studying very much!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from student!");
    }
}
