package com.startjava.lesson_4;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printIntArray(numbers);
        int len = numbers.length - 1;
        for (int i = 0; i < len; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len];
            numbers[len] = temp;
            len--;
        }
        System.out.println();
        printIntArray(numbers);

        System.out.println("\n\n2. Вывод произведения элементов массива\n");
        numbers = populateArray(10);
        len = numbers.length;
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= numbers[i];
        }
        String result = "";
        for (int i = 0; i < len; i++) {
            if (i == 0 || i == 9) {
                System.out.println("индекс числа " + numbers[i] + " is " + i);
            } else {
                result = (i < 8) ? result + (numbers[i] + " * ") : result + numbers[i] + " = ";
            }
        }
        System.out.println(result + product);

        System.out.println("\n3. Удаление элементов массива\n");
        float[] randomNums = new float[15];
        len = randomNums.length;
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            randomNums[i] = rand.nextFloat();
        }
        printFloatArray(randomNums);
        System.out.println("\n");
        float middle = randomNums[len / 2 + 1];
        int zeros = 0;
        for (int i = 0; i < len; i++) {
            if (randomNums[i] > middle) {
                randomNums[i] = 0.0f;
                zeros++;
            }
        }
        printFloatArray(randomNums);
        System.out.println("\nколичество обнуленных ячеек: " + zeros);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        len = letters.length;
        for (int i = 0; i < len; i++) {
            letters[i] = (char) (65 + i);
        }
        for (int i = len; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел\n");
        numbers = new int[30];
        len = numbers.length;
        int counter = 0;
        while (counter <=30) {
            int num;
            num = (int) (Math.random() * (100 - 60)) + 60;
            for (int i = 0; i < len; i++) {
                if(num == numbers[i]) {
                    break;
                } else if (numbers[i] == 0  || counter == 30) {
                    numbers[i] = num;
                    counter++;
                    break;
                }
            }
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i = 1; i < len + 1; i++) {
            System.out.print(numbers[i-1] + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива\n");

        String[] arr = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")) {
                counter++;
            }
        }
        int newArrLength = arr.length - counter;
        String[] newArr = new String[newArrLength];
        int dest = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].isBlank()) {
                System.arraycopy(arr, i, newArr, dest, 1);
                dest++;
            }
        }
        printStringArray(newArr);
    }

    private static void printIntArray(int[] numbers) {
        for(int num : numbers) {
            System.out.printf("%d ", num);
        }
    }

    private static void printFloatArray(float[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-2.3f ", arr[i]);
            counter++;
            if (counter == 8) {
                System.out.println();
            }
        }
    }

    private static int[] populateArray(int len) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static void printStringArray(String[] words) {
        for(String str : words) {
            System.out.printf("%s ", str);
        }
    }
}