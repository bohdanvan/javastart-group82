package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        int n = array[2];
        System.out.println(n);

        array[2] = 10;
        int len = array.length;
        System.out.println("len = " + len);

        int lastElem = array[array.length - 1];

        System.out.println(Arrays.toString(array));

        // fori
        for (int i = 0; i < array.length; i++) {

        }
    }
}
