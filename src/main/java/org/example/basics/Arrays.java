package org.example.basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oksanapoliakova on 13.10.2023
 * @projectName JavaInterviewPreparing
 */
public class Arrays {
    public static void main(String[] args) {
        testArrays();
        carsOutput();
        carsForIn();
    }

    static String[] cars = {"BMW", "Volvo", "Ford"};
    static Integer[] numbers = {10, 30, 20};

    public static void testArrays() {
        numbers[0] = 1;

        System.out.println(cars[1]);
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
    }

    public static void carsOutput() {
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void carsForIn() {
        for(String car : cars) {
            System.out.println(car);
        }

        System.out.println("==============");

        List<String> arrayList = new ArrayList<>(List.of(cars));

        arrayList.forEach(System.out::println);
    }
}
