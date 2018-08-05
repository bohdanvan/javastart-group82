package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        int day = 1; // (1)
        while (day <= 5) { // (2)
            System.out.print(day + " ");
            day++; // (3)
        }
        System.out.println();

        // for ( 1 ; 2 ; 3 ) { ... }
        for (int d = 1; d <= 5; d++) {
            System.out.print(d + " ");
        }
        System.out.println();

        for (int d = 5; d >= 1; d--) {
            System.out.print(d + " ");
        }
        System.out.println();

        // 10, 20, 30, ... 100
        for (int n = 10; n <= 100; n = n + 10) {
            System.out.print(n + " ");
        }
    }
}
