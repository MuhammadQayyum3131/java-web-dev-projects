package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(18);
        numbers.add(21);
        numbers.add(24);
        numbers.add(27);
        numbers.add(28);
        numbers.add(31);


        int sum = sumOfEvenNumbers(numbers);
        System.out.println("Sum of even numbers: " + sum);

        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");

        printWordsWithSpecificLength(words, 5);
    }

    public static int sumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static void printWordsWithSpecificLength(List<String> words, int length) {
        System.out.println("Words with length " + length + ":");
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
