package org.launchcode;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = text.split(" ");
        System.out.println("Array of words:");
        System.out.println(Arrays.toString(words));

        String[] sentences = text.split("\\.");
        System.out.println("Array of sentences:");
        System.out.println(Arrays.toString(sentences));
    }
}
