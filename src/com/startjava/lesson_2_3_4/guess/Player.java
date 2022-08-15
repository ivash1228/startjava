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

    public boolean addNumber(int number) {
        countAttempts++;
        if (number > 100 || number < 0 ) {
            System.out.println("You put invalid number, now it is next player's turn");
            return false;
        }
        numbers[countAttempts - 1] = number;
        return true;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void clear() {
        Arrays.fill(numbers,0, countAttempts, 0);
        countAttempts = 0;
    }

    public int getLastNumber() {
        return numbers[countAttempts - 1];
    }
}
