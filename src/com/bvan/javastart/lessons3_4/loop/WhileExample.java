package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WhileExample {

    public static void main(String[] args) {
        long salary = 600; // (1)

        while (salary < 10000) { // (2)
            System.out.println("I have " + salary + ". Change company");
            salary = salary + 1000; // (3)
            System.out.println("Work for a year");
        }

        System.out.println("I have " + salary);
    }
}
