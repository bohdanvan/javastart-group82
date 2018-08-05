package com.bvan.javastart.lesson1_2;

/**
 * @author bvanchuhov
 */
public class BasicOperations {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45

        age += 1; // 46
        age++; // 47 (increment)
        ++age; // 48

        age--; // 47 (decrement)
        --age; // 46

        System.out.println(age);
    }
}
