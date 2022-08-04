package com.startjava.lesson_2_3.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers;
    private int counter;

    public Player(String name) {
        this.name = name;
        counter = 0;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
         counter++;
    }

    public void emptyArray() {
        Arrays.fill(numbers, 0,getCounter(), 0);
    }
}
