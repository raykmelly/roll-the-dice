package com.pluralsight;

public class Dice {
    // Roll dice method, returns a random value between minValue and maxValue
    public int roll(int minValue, int maxValue) {
        return (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}