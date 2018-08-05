package com.bvan.javastart.lessons3_4.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello, Java";

        int len = s.length(); // method
        System.out.println(len); // 4

        char c = s.charAt(1);
        System.out.println(c);

        System.out.println(s.charAt(s.length() - 1));
    }
}
