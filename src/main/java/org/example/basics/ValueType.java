package org.example.basics;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class ValueType {
    public static void main(String[] args) {
        String name = "Molly";

        changeValueName(name);
        System.out.println(name); // Molly
        /** We're working not with the original object, but with a copy of this object */
    }
    /** */
    private static void changeValueName(String name) {
        name = "Bella";
    }
}
