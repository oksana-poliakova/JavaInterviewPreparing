package org.example.basics;

/**
 * @author oksanapoliakova on 13.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Loops {
    public static void main(String[] args) {
        checkLoop1();
    }

    public static void checkLoop1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void checkLoop2() {
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
        }
        i++;
    }
}
