package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers;
    private int countAttempts;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void addNumber(int index, int number) {
        numbers[index] = number;
        increaseCounter();
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void increaseCounter() {
         countAttempts++;
    }

    public void resetNumbers() {
        Arrays.fill(numbers,0, countAttempts,0);
        countAttempts = 0;
    }
}
