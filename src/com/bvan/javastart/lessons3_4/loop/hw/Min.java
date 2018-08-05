package com.bvan.javastart.lessons3_4.loop.hw;

/**
 * @author bvanchuhov
 */
public class Min {

    public static void main(String[] args) {
        int a = 30;
        int b = 30;

//        int min;
//        if (a < b) {
//            min = a;
//        } else {
//            min = b;
//        }
        int min = (a < b) ? a : b;

        System.out.println(min);
    }
}
