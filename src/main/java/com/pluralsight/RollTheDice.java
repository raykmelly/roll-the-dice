package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        // Instance the dice object
        Dice dice = new Dice();

        // Variables
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // For loop to roll the dice 100 times
        for (int i = 1; i < 100; i++) {
            // Roll the dice and get the sum of both
            int roll1 = dice.roll(1,6);
            int roll2 = dice.roll(1,6);
            int sum = roll1 + roll2;

            // Switch case to check dice roll values
            switch (sum) {
                case 2: // Check if value is 2
                    twoCounter++;
                    break;
                case 4: // Check if value is 4
                    fourCounter++;
                    break;
                case 6: // Check if value is 6
                    sixCounter++;
                    break;
                case 7: // Check if value is 7
                    sevenCounter++;
            }

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);
        }

        // Display the counters
        display(twoCounter, fourCounter, sixCounter, sevenCounter);
    }

    // Method to display the counters
    public static void display(int twoCounter, int fourCounter, int sixCounter, int sevenCounter){
        System.out.println(
                "\n[Two Counter]: " + twoCounter + "\n"
                + "[Four Counter]: " + fourCounter + "\n"
                + "[Six Counter]: " + sixCounter + "\n"
                + "[Seven Counter]: " + sevenCounter + "\n"
                );
    }
}
