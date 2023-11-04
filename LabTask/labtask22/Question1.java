/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask22;
public class Question1 {

    // Method to count elements with a specific property
    public static <T> int countElementsWithProperty(T[] collection, PropertyChecker<T> propertyChecker) {
        int count = 0;
        for (T item : collection) {
            if (propertyChecker.checkProperty(item)) {
                count++;
            }
        }
        return count;
    }

    // Functional interface for property checking
    public interface PropertyChecker<T> {
        boolean checkProperty(T item);
    }

    // Example property checkers
    public static boolean isOdd(Integer number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"radar", "hello", "level", "world"};

        int oddCount = countElementsWithProperty(numbers, Question1::isOdd);
        int primeCount = countElementsWithProperty(numbers, Question1::isPrime);
        int palindromeCount = countElementsWithProperty(strings, Question1::isPalindrome);

        System.out.println("Number of odd elements: " + oddCount);
        System.out.println("Number of prime elements: " + primeCount);
        System.out.println("Number of palindromes: " + palindromeCount);
    }
}
