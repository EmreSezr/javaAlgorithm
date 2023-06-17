package org.emresezer.C5;

import java.util.Arrays;

public class DifferenceOfHighestNumber {

    public static int[] calculateDifferenceArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        int[] differenceOfArray = arr;

        for (int i = 0; i < arr.length; i++) {
            int difference = max - differenceOfArray[i];
            differenceOfArray[i] = difference;
        }

        return differenceOfArray;

    }


    public static void main(String[] args) {
        int[] sampleArray = {5, 51, 15, 25, 29, 60, 32, 45};
        System.out.println(Arrays
                .toString(calculateDifferenceArray(sampleArray)));
    }
}
