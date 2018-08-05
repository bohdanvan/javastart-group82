package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SumExample {

    public static void main(String[] args) {
        long[] prices = {20, 15, 5, 30};

//        long sum = 0;
//        for (int i = 0; i < prices.length; i++) {
//            long price = prices[i];
//            sum += price;
//        }
//        System.out.println("sum = " + sum);

        // for-each
        long sum = 0;
        for (long price : prices) {
            sum += price;
        }
        System.out.println("sum = " + sum);
    }
}
