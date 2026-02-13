package com.example;

/**
 * Simple Calculator class for SonarQube coverage testing
 */
public class App {

    // Constants to replace magic numbers
    private static final int DISCOUNT_PERCENTAGE = 10;
    private static final int PERCENTAGE_DIVISOR = 100;

    /**
     * Calculates discount on price
     * @param price the original price
     * @return discounted amount
     */
    public int calculateDiscount(int price) {
        return price * DISCOUNT_PERCENTAGE / PERCENTAGE_DIVISOR;
    }

    /**
     * Formats name to uppercase
     * @param name the name to format
     * @return formatted name in uppercase, or empty string if name is null/empty
     */
    public String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        return name.toUpperCase();
    }

    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers
     * @param a first number
     * @param b second number
     * @return result of a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two numbers
     * @param a dividend
     * @param b divisor
     * @return result of a / b
     * @throws IllegalArgumentException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Checks if a number is positive
     * @param number the number to check
     * @return true if number is positive, false otherwise
     */
    public boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Checks if a number is even
     * @param number the number to check
     * @return true if number is even, false otherwise
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        System.out.println("5 + 3 = " + app.add(5, 3));
        System.out.println("5 - 3 = " + app.subtract(5, 3));
        System.out.println("5 * 3 = " + app.multiply(5, 3));
        System.out.println("5 / 3 = " + app.divide(5, 3));
    }
}
