package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        double celsius = -10.2; // Input: any valid Celsius temperature

        double fahrenheit = celsius * 1.8 + 32; // Your formula

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }
}

// Test:
// -10.2 °C -> 13.64 °F
// 0.0 °C -> 32.0 °F
// 30.0 °C -> 86.0 °F
