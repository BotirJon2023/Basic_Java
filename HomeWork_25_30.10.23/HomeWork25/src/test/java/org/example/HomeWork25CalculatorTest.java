package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork25CalculatorTest {

    @Test
    public void testAdd() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();
        int result = calculator.add(5, 7);
        assertEquals(12, result); // Ожидаем, что результат будет равен 12
    }


    @Test
    public void testSubtract() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();
        int result = calculator.subtract(10, 3);
        assertEquals(7, result); // Ожидаем, что результат будет равен 7
    }

    @Test
    public void testMultiply() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();
        int result = calculator.multiply(5, 4);
        assertEquals(20, result); // Ожидаем, что результат будет равен 20
    }

    @Test
    public void testDivide() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test dividing by a non-zero number
        int result = calculator.divide(10, 2);
        assertEquals(5, result); // Expect the result to be 5

        // Test dividing by zero, should throw an ArithmeticException
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    public void testPower() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test raising a positive base to a positive exponent
        double result1 = calculator.power(2.0, 3.0);
        assertEquals(8.0, result1, 0.001); // Expect the result to be approximately 8.0

        // Test raising a negative base to an even exponent
        double result2 = calculator.power(-2.0, 2.0);
        assertEquals(4.0, result2, 0.001); // Expect the result to be approximately 4.0

        // Test raising a base to a zero exponent
        double result3 = calculator.power(5.0, 0.0);
        assertEquals(1.0, result3, 0.001); // Expect the result to be 1.0
    }

    @Test
    public void testFactorial() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test factorial of 0, expect 1
        long result1 = calculator.factorial(0);
        assertEquals(1, result1);

        // Test factorial of 1, expect 1
        long result2 = calculator.factorial(1);
        assertEquals(1, result2);

        // Test factorial of a positive number (e.g., 5), expect 120
        long result3 = calculator.factorial(5);
        assertEquals(120, result3);

        // Test factorial of a larger positive number (e.g., 10), expect 3628800
        long result4 = calculator.factorial(10);
        assertEquals(3628800, result4);
    }

    @Test
    public void testIsEven() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test an even number, expect true
        boolean result1 = calculator.isEven(4);
        assertTrue(result1);

        // Test an odd number, expect false
        boolean result2 = calculator.isEven(7);
        assertFalse(result2);

        // Test zero, expect true
        boolean result3 = calculator.isEven(0);
        assertTrue(result3);

        // Test a negative even number, expect true
        boolean result4 = calculator.isEven(-6);
        assertTrue(result4);

        // Test a negative odd number, expect false
        boolean result5 = calculator.isEven(-9);
        assertFalse(result5);
    }

    @Test
    public void testFindMax() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test an array with positive values
        int[] array1 = {5, 12, 7, 3, 9};
        int result1 = calculator.findMax(array1);
        assertEquals(12, result1);

        // Test an array with a single element
        int[] array2 = {8};
        int result2 = calculator.findMax(array2);
        assertEquals(8, result2);

        // Test an array with negative values
        int[] array3 = {-3, -7, -1, -9, -2};
        int result3 = calculator.findMax(array3);
        assertEquals(-1, result3);
    }

    @Test
    public void testIsPrime() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a prime number (e.g., 17)
        boolean result1 = calculator.isPrime(17);
        assertTrue(result1);

        // Test a non-prime number (e.g., 10)
        boolean result2 = calculator.isPrime(10);
        assertFalse(result2);

        // Test 0, expect false
        boolean result3 = calculator.isPrime(0);
        assertFalse(result3);

        // Test 1, expect false
        boolean result4 = calculator.isPrime(1);
        assertFalse(result4);

        // Test a negative number (e.g., -7), expect false
        boolean result5 = calculator.isPrime(-7);
        assertFalse(result5);
    }

    @Test
    public void testToBaseString() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test converting 10 to binary (base 2)
        String result1 = calculator.toBaseString(10, 2);
        assertEquals("1010", result1);

        // Test converting 15 to octal (base 8)
        String result2 = calculator.toBaseString(15, 8);
        assertEquals("17", result2);

        // Test converting 255 to hexadecimal (base 16)
        String result3 = calculator.toBaseString(255, 16);
        assertEquals("FF", result3);

        // Test base less than 2, should throw an exception
        assertThrows(IllegalArgumentException.class, () -> calculator.toBaseString(10, 1));

        // Test base greater than 16, should throw an exception
        assertThrows(IllegalArgumentException.class, () -> calculator.toBaseString(10, 17));
    }

    @Test
    public void testSqrt() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test square root of a positive number (e.g., 25)
        double result1 = calculator.sqrt(25);
        assertEquals(5.0, result1, 0.001);

        // Test square root of zero, expect 0
        double result2 = calculator.sqrt(0);
        assertEquals(0.0, result2, 0.001);

        // Test square root of a non-integer number (e.g., 2.25)
        double result3 = calculator.sqrt(2.25);
        assertEquals(1.5, result3, 0.001);

        // Test square root of a negative number, should throw an exception
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-4.0));
    }

    @Test
    public void testReverseString() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test reversing a string
        String result1 = calculator.reverseString("Hello");
        assertEquals("olleH", result1);

        // Test an empty string, expect an empty string
        String result2 = calculator.reverseString("");
        assertEquals("", result2);

        // Test a single-character string, expect the same character
        String result3 = calculator.reverseString("X");
        assertEquals("X", result3);

        // Test a string with spaces, punctuation, and numbers
        String result4 = calculator.reverseString("123 abc,def .ghi");
        assertEquals("ihg. fed,cba 321", result4);
    }

    @Test
    public void testIsPalindrome() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a palindrome, expect true
        assertTrue(calculator.isPalindrome("racecar"));

        // Test a non-palindrome, expect false
        assertFalse(calculator.isPalindrome("hello"));

        // Test an empty string, expect true
        assertTrue(calculator.isPalindrome(""));

        // Test a single-character string, expect true
        assertTrue(calculator.isPalindrome("X"));

        // Test a case-insensitive palindrome, expect true
        assertTrue(calculator.isPalindrome("MaDaM"));

        // Test a palindrome with spaces and punctuation, expect true
        assertTrue(calculator.isPalindrome("A man, a plan, a canal, Panama!"));

        // Test a non-palindrome with spaces and punctuation, expect false
        assertFalse(calculator.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testGCD() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test GCD of two positive numbers
        int result1 = calculator.gcd(36, 48);
        assertEquals(12, result1);

        // Test GCD of two negative numbers
        int result2 = calculator.gcd(-36, -48);
        assertEquals(12, result2);

        // Test GCD of one positive and one negative number
        int result3 = calculator.gcd(-36, 48);
        assertEquals(12, result3);

        // Test GCD of two zeros
        int result4 = calculator.gcd(0, 0);
        assertEquals(0, result4);

        // Test GCD where one number is zero
        int result5 = calculator.gcd(0, 25);
        assertEquals(25, result5);
    }

    @Test
    public void testProductOfArray() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test the product of an array of positive numbers
        int[] array1 = {1, 2, 3, 4, 5};
        long result1 = calculator.productOfArray(array1);
        assertEquals(120, result1);

        // Test the product of an array with a single element
        int[] array2 = {10};
        long result2 = calculator.productOfArray(array2);
        assertEquals(10, result2);

        // Test the product of an array with one zero
        int[] array3 = {3, 5, 0, 7, 2};
        long result3 = calculator.productOfArray(array3);
        assertEquals(0, result3);

        // Test the product of an empty array
        int[] array4 = {};
        long result4 = calculator.productOfArray(array4);
        assertEquals(1, result4);

        // Test the product of an array with negative numbers
        int[] array5 = {2, -4, 3};
        long result5 = calculator.productOfArray(array5);
        assertEquals(-24, result5);
    }

    @Test
    public void testLengthOfLongestWord() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a sentence with words of different lengths
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        int result1 = calculator.lengthOfLongestWord(sentence1);
        assertEquals(6, result1); // "jumps" is the longest word

        // Test a sentence with words of the same length
        String sentence2 = "Red green blue";
        int result2 = calculator.lengthOfLongestWord(sentence2);
        assertEquals(5, result2); // All words are the same length

        // Test a sentence with a single word
        String sentence3 = "Hello";
        int result3 = calculator.lengthOfLongestWord(sentence3);
        assertEquals(5, result3); // "Hello" is the only word

        // Test an empty sentence
        String sentence4 = "";
        int result4 = calculator.lengthOfLongestWord(sentence4);
        assertEquals(0, result4); // No words in the sentence

        // Test a sentence with words containing punctuation
        String sentence5 = "The quick brown fox, jumps over the lazy dog.";
        int result5 = calculator.lengthOfLongestWord(sentence5);
        assertEquals(6, result5); // "jumps" is still the longest word
    }

    @Test
    public void testCelsiusToFahrenheit() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a positive temperature in Celsius
        double result1 = calculator.celsiusToFahrenheit(25.0);
        assertEquals(77.0, result1, 0.01);

        // Test a negative temperature in Celsius
        double result2 = calculator.celsiusToFahrenheit(-10.0);
        assertEquals(14.0, result2, 0.01);

        // Test freezing point of water in Celsius (0 degrees)
        double result3 = calculator.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result3, 0.01);

        // Test absolute zero in Celsius (-273.15 degrees)
        double result4 = calculator.celsiusToFahrenheit(-273.15);
        assertEquals(-459.67, result4, 0.01);
    }

    @Test
    public void testContainsSubstring() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a substring present in the main string
        assertTrue(calculator.containsSubstring("Hello, world!", "world"));

        // Test an empty substring, should return true
        assertTrue(calculator.containsSubstring("Hello, world!", ""));

        // Test an empty main string, should return false
        assertFalse(calculator.containsSubstring("", "Hello"));

        // Test a substring not present in the main string
        assertFalse(calculator.containsSubstring("Java is fun", "Python"));

        // Test a substring equal to the main string
        assertTrue(calculator.containsSubstring("Testing", "Testing"));
    }

    @Test
    public void testSumOfDigits() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a positive number with multiple digits
        int result1 = calculator.sumOfDigits(12345);
        assertEquals(15, result1);

        // Test a single-digit positive number
        int result2 = calculator.sumOfDigits(7);
        assertEquals(7, result2);

        // Test a negative number with multiple digits
        int result3 = calculator.sumOfDigits(-9876);
        assertEquals(6, result3);

        // Test a single-digit negative number
        int result4 = calculator.sumOfDigits(-3);
        assertEquals(3, result4);

        // Test zero, expect 0
        int result5 = calculator.sumOfDigits(0);
        assertEquals(0, result5);
    }

    @Test
    public void testIsLeapYear() {
        HomeWork25Calculator calculator = new HomeWork25Calculator();

        // Test a leap year (e.g., 2020)
        assertTrue(calculator.isLeapYear(2020));

        // Test a non-leap year (e.g., 2022)
        assertFalse(calculator.isLeapYear(2022));

        // Test a leap year divisible by 100 but not by 400 (e.g., 1900)
        assertFalse(calculator.isLeapYear(1900));

        // Test a leap year divisible by 100 and 400 (e.g., 2000)
        assertTrue(calculator.isLeapYear(2000));

        // Test a non-leap year (e.g., 2023)
        assertFalse(calculator.isLeapYear(2023));
    }
}
