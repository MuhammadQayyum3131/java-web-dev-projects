package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1,1, 2, 3, 5, 8};

        System.out.println("All values in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Odd values in the array:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
