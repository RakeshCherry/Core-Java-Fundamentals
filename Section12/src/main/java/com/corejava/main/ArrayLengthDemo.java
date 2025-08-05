package com.corejava.main;

import java.awt.*;

public class ArrayLengthDemo {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        String[] names = new String[]{"Jon", "Lucy", "Madan"};
        int[] mobileNumbers = new int[116];

        System.out.println(nums.length);
        System.out.println(names.length);
        System.out.println(mobileNumbers.length);

        // double [] prices = new double[Integer.MAX_VALUE]; //OutOfMemoryError
       // double [] prices = new double[Integer.MAX_VALUE+1]; // "NegativeArraySizeException"
       // double [] prices = new double[-123]; // "NegativeArraySizeException"
        double [] prices = new double[1000];
        System.out.println(prices.length);

        // empty Arrays
        char[] grades = new char[0];
        int[] emptyArray = {};
        System.out.println(emptyArray.length);
    }
}
