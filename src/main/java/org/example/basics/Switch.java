package org.example.basics;

import java.util.logging.Filter;

/**
 * @author oksanapoliakova on 13.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Switch {
    enum Days {
        MONDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    public static void main(String[] args) {
        checkDays(Days.MONDAY);
    }

    public static void checkDays(Days days) {
        switch (days) {
            case MONDAY -> System.out.println("Monday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
            default -> System.out.println("Invalid value");
        }
    }
}
