package org.example.basics;

/**
 * @author oksanapoliakova on 10.10.2023
 * @projectName JavaInterviewPreparing
 */
public class DataTypes {
    /** Primitive data types */
    private final int someInt = 5;
    private final double someDouble = 24.53;
    private final boolean trueOrFalse = true;
    private final char someChar = 'a';
    private final String someString = "Some string";
    private final Long someLong = 1234567L;
    private final float someFloat = 1.1F;
    private final byte someByte = -128;

    /** Arrays with values init */
    int[] numbersArray = { 1, 2, 3, 4 };
    String[] stringsArray = { "text1", "text2" };

    /** String */
    String string1 = "It stored in a string pool as a literal";
    String string2 = "Always creates a new String object on the heap";

    /** Enum */
    enum Day { MONDAY, TUESDAY };

    int[][] twoDArray = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

    public static void main(String[] args) {

        /** Arrays */
        int[] myIntArray = new int[5];
        myIntArray[0] = 1;

        String[] myStringArray = new String[3];
        myStringArray[2] = "Some element";
    }
}
