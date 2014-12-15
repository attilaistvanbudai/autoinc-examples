/*
     * Description Write a program to find the sum of each digit in the given number.
     * 
     * Examples: 1) Input: 9; Result: 9; 2) Input: -13; Result: 4;
     * 
     * 3) Input: 12; Result: 3; 4) Input: 12345 Result: 15 4) Input: -12345 Result: 15
     */

    // This is a one-liner, but in this format it's hard enough...
    public static Integer sumOfDigits(final int number) {
        return //
        (number != 0) //
        ? //
        Math.abs(number % 10) //
        + //
        sumOfDigits(number / 10)//
        : //
        number;
    }

    /*
     * Description Write a program to find the sum of each digit in the given number.
     * 
     * Examples: 1) Input: 9; Result: 9; 2) Input: -13; Result: 4;
     * 
     * 3) Input: 12; Result: 3; 4) Input: 12345 Result: 15 4) Input: -12345 Result: 15
     */

    public static Integer sumOfDigitsNonRecursive(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }







//======================
//=========TEST=========
//======================
//
//This is the full test class with class declarations.



package com.epam.autioint.sumOfDigits;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class SumOfDigitsTest {

    @Test
    public void testSumOfDigitsShouldReturn1On1() {
        // Given
        int number = 1;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 1;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturn1On10() {
        // Given
        int number = 10;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 1;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturn2On11() {
        // Given
        int number = 11;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 2;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturn18On99() {
        // Given
        int number = 99;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 18;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturn18On9009() {
        // Given
        int number = 9009;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 18;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturn21On123456() {
        // Given
        int number = 123456;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 21;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturnMinus1OnMinus1() {
        // Given
        int number = -1;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 1;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsShouldReturnMinus5OnMinus122() {
        // Given
        int number = -122;
        // When
        Integer result = SumOfDigits.sumOfDigits(number);
        // Then
        Integer expected = 5;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturn1On1() {
        // Given
        int number = 1;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 1;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturn1On10() {
        // Given
        int number = 10;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 1;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturn2On11() {
        // Given
        int number = 11;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 2;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturn18On99() {
        // Given
        int number = 99;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 18;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturn18On9009() {
        // Given
        int number = 9009;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 18;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturn21On123456() {
        // Given
        int number = 123456;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 21;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturnMinus1OnMinus1() {
        // Given
        int number = -1;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 1;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }

    @Test
    public void testSumOfDigitsNonRecursiveShouldReturnMinus5OnMinus122() {
        // Given
        int number = -122;
        // When
        Integer result = SumOfDigits.sumOfDigitsNonRecursive(number);
        // Then
        Integer expected = 5;
        assertEquals(result, expected, "SumOfDigits should return " + expected + " when number is " + number);
    }
}