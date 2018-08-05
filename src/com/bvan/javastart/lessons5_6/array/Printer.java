package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class Printer {

    public static void main(String[] args) {
        int[] array = {30, 15, 10, 5};

        for (int elem : array) {
            System.out.println(elem);
        }
        System.out.println();

        System.out.println("Reversed");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
