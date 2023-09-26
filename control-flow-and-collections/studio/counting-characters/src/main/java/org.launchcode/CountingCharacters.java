package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String inputString = input.nextLine();
        input.close();
        System.out.println(inputString);

        char[] characters = inputString.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char letter : characters) {
            if (characterCount.containsKey(letter)) {
                characterCount.put(letter, characterCount.get(letter) + 1);
            } else {
                characterCount.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> count : characterCount.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
