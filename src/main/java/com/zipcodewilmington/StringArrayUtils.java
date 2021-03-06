package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        int lastElement = array.length - 1;
        return array[lastElement];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        int secondLast = array.length - 2;
        return array[secondLast];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        return getNumberOfOccurrences(array, value) > 0;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {


        String[] reversedArray = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];

        }
        return reversedArray;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        return Arrays.equals(reverse(array), array);
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String lower = "";

        for (int i = 0; i < array.length; i++) {
            lower += array[i].toLowerCase();
        }

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lower.indexOf(letter) < 0) {
                return false;
            }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int cleanIndex = 0;

        String[] clean = new String[array.length - getNumberOfOccurrences(array, valueToRemove)];


        for (int i = 0; i < array.length; i++) {

            if (!array[i].equals(valueToRemove)) {
                clean[cleanIndex] = (array[i]);
                cleanIndex++;
            }
        }

        return clean;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String cleaner = array[0] + " ";

        for (int i = 1; i < array.length; i++) {

            if (!array[i].equals(array[i - 1])) {
                cleaner += array[i] + " ";
            }
        }

        String[] clean = cleaner.split(" ");

        System.out.println(cleaner);

        return clean;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String packer = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                packer += array[i];
            } else {
                packer += " " + array[i];
            }
        }


        String[] packed = packer.split(" ");

        return packed;
    }
}




