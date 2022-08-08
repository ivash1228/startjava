package com.startjava.lesson_2_3_4;

import java.io.OutputStream;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printIntArray(numbers);
        int elementsNumber = numbers.length - 1;
        for (int i = 0; i < elementsNumber; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[elementsNumber];
            numbers[elementsNumber] = temp;
            elementsNumber--;
        }
        System.out.println();
        printIntArray(numbers);

        System.out.println("\n\n2. Вывод произведения элементов массива\n");
        numbers = fillArray(10);
        elementsNumber = numbers.length;
        int product = 1;
        for (int i = 1; i < elementsNumber - 1; i++) {
            product *= numbers[i];
            System.out.print((i < 8) ? (numbers[i] + " * ") : (numbers[i] + " = " + product));
        }
        System.out.println();
        for (int i = 0; i < elementsNumber; i += 9) {
                System.out.println("индекс числа " + numbers[i] + " is " + i);
        }

        System.out.println("\n3. Удаление элементов массива\n");
        float[] randomNums = new float[15];
        elementsNumber = randomNums.length;
        Random rand = new Random();
        for (int i = 0; i < elementsNumber; i++) {
            randomNums[i] = rand.nextFloat();
        }
        printFloatArray(randomNums);
        System.out.println("\n");
        float middle = randomNums[elementsNumber / 2 + 1];
        int zeros = 0;
        for (int i = 0; i < elementsNumber; i++) {
            if (randomNums[i] > middle) {
                randomNums[i] = 0.0f;
                zeros++;
            }
        }
        printFloatArray(randomNums);
        System.out.println("\nколичество обнуленных ячеек: " + zeros);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        elementsNumber = letters.length;
        for (int i = 0; i < elementsNumber; i++) {
            letters[i] = (char) (65 + i);
        }
        for (int i = elementsNumber; i >= 0; i--) {
            for (int j = elementsNumber - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел\n");
        numbers = new int[30];
        elementsNumber = numbers.length;
        int counter = 0;
        while (counter <=30) {
            int num = (int) (Math.random() * (100 - 60)) + 60;
            for (int i = 0; i < elementsNumber; i++) {
                if(num == numbers[i]) {
                    break;
                }
                if (numbers[i] == 0 || counter == 30) {
                    numbers[i] = num;
                    counter++;
                    break;
                }
            }
        }
        for(int i = 0; i < elementsNumber; i++) {
            for(int j = 0; j < elementsNumber; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i = 1; i < elementsNumber + 1; i++) {
            System.out.print(numbers[i - 1] + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива\n");

        String[] srcArr = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        int newArrLength = 0;

        //find a destArr length
        for(int i = 0; i < srcArr.length; i++) {
            if(srcArr[i].isEmpty()) {
                continue;
            } else newArrLength++;
        }

        String[] destArr = new String[newArrLength];

        int dest = 0;
        int curr = 0;
        elementsNumber = 0;

        for(int i = 0; i < srcArr.length; i++) {
            if (srcArr[i].isBlank()) {
                curr++;
                continue;
            } else {
                while (!srcArr[i].isBlank()) {
                    elementsNumber++;
                    i++;
                }
                System.arraycopy(srcArr, curr, destArr, dest, elementsNumber);
                curr = i;
                i--;
                dest += elementsNumber;
                elementsNumber = 0;
            }
        }
        printStringArray(destArr);
    }

    private static void printIntArray(int[] nums) {
        for(int num : nums) {
            System.out.printf("%d ", num);
        }
    }

    private static void printFloatArray(float[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-2.3f ", nums[i]);
            counter++;
            if (counter == 8) {
                System.out.println();
            }
        }
    }

    private static int[] fillArray(int len) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static void printStringArray(String[] strings) {
        for(String letter : strings) {
            System.out.printf("%s ", letter);
        }
    }
}