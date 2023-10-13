package org.example.oop;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Person {
    private String name;
    private Integer age;

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }

    public void saySomething() {
        System.out.println("Person say something");
    }

    /** Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error! Name shouldn't be empty!");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error! Age should be between 0 and 120");
        }
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
