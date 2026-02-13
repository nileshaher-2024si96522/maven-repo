package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for App class
 */
public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    // Tests for add method
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddZero() {
        assertEquals(5, app.add(5, 0));
        assertEquals(0, app.add(0, 0));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, app.add(-2, -3));
        assertEquals(1, app.add(5, -4));
    }

    // Tests for subtract method
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2, app.subtract(5, 3));
    }

    @Test
    public void testSubtractZero() {
        assertEquals(5, app.subtract(5, 0));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(9, app.subtract(5, -4));
    }

    // Tests for multiply method
    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(15, app.multiply(5, 3));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, app.multiply(5, 0));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(6, app.multiply(-2, -3));
        assertEquals(-6, app.multiply(2, -3));
    }

    // Tests for divide method
    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2, app.divide(6, 3));
    }

    @Test
    public void testDivideWithRemainder() {
        assertEquals(1, app.divide(5, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroThrowsException() {
        app.divide(5, 0);
    }

    // Tests for isPositive method
    @Test
    public void testIsPositiveWithPositiveNumber() {
        assertTrue(app.isPositive(5));
    }

    @Test
    public void testIsPositiveWithZero() {
        assertFalse(app.isPositive(0));
    }

    @Test
    public void testIsPositiveWithNegativeNumber() {
        assertFalse(app.isPositive(-5));
    }

    // Tests for isEven method
    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(app.isEven(4));
        assertTrue(app.isEven(0));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(app.isEven(5));
        assertFalse(app.isEven(-3));
    }

    @Test
    public void testIsEvenWithNegativeEvenNumber() {
        assertTrue(app.isEven(-4));
        assertTrue(app.isEven(-2));
    }

    // Additional edge case tests
    @Test
    public void testDivideNegativeNumbers() {
        assertEquals(-2, app.divide(-6, 3));
        assertEquals(2, app.divide(-6, -3));
    }

    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-10, app.subtract(5, 15));
    }

    @Test
    public void testAddLargeNumbers() {
        assertEquals(1000000, app.add(500000, 500000));
    }

    // Test for main method
    @Test
    public void testMainMethod() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            fail("Main method should not throw exception: " + e.getMessage());
        }
    }

    // Tests for calculateDiscount method
    @Test
    public void testCalculateDiscountBasic() {
        assertEquals(10, app.calculateDiscount(100));
        assertEquals(5, app.calculateDiscount(50));
        assertEquals(0, app.calculateDiscount(0));
    }

    @Test
    public void testCalculateDiscountWithLargePrice() {
        assertEquals(100, app.calculateDiscount(1000));
    }

    // Tests for formatName method
    @Test
    public void testFormatNameWithValidInput() {
        assertEquals("JOHN", app.formatName("john"));
        assertEquals("ALICE", app.formatName("alice"));
        assertEquals("JOHNDOE", app.formatName("JohnDoe"));
    }

    @Test
    public void testFormatNameWithNull() {
        assertEquals("", app.formatName(null));
    }

    @Test
    public void testFormatNameWithEmptyString() {
        assertEquals("", app.formatName(""));
    }
}
