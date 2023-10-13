package org.example.oop;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Teacher extends Person implements SayHello {
    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("I'm a teacher and I'm teaching");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from teacher!");
    }

    @Override
    public void saySomething() {
        System.out.println("I'm a great teacher");
    }
}
