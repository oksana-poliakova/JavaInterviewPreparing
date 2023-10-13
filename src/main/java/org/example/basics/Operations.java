package org.example.basics;

/**
 * @author oksanapoliakova on 13.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Operations {
    private static final Integer a = 5;
    private static final Integer b = 10;
    private static final Integer c = 12;

    public static void main(String[] args) {
        check1();
        check2();
        check3();
    }

    private static void check1() {
        Integer result = (a + b) * c / a;
        System.out.println(result);
    }

    private static void check2() {
        if (a > 3 && b > 8 || c > 20) {
            System.out.println("Result is correct");
        } else if (c == 12) {
            System.out.println("C == 12");
        } else {
            System.out.println("Error");
        }
    }

    private static void check3() {
        if ((b % a) > 1) {
            System.out.println("Test b % a");
        } else {
            System.out.println("b % a == 0");
        }
    }
}
