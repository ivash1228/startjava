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
            len -= 1;
        }
        System.out.println();
        printIntArray(numbers);

        System.out.println("\n\n2. Вывод произведения элементов массива\n");
        int[] nums = populateArray(10);
        len = nums.length;
        int product = 1;
        for (int i = 0; i < len; i++) {
            product = (i > 0) ? product * nums[i] : product;
            String result = (i == 0 || i == 9) ? ("индекс числа " + nums[i] + " - " + i + "\n") :
                    (i < len - 2 ? (nums[i] + " * ") :
                            (nums[i] + " = " + product + "\n"));
            System.out.print(result);
        }

        System.out.println("\n3. Удаление элементов массива\n");
        float[] randomNums = new float[15];
        len = randomNums.length;
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            randomNums[i] = rand.nextFloat();
        }
        int counter = 0;
        for (int i = 0; i < len; i++) {
            System.out.printf("%-2.3f ", randomNums[i]);
            counter++;
            if (counter == 8) {
                System.out.println();
            }
        }
        System.out.println("\n");
        float middle = randomNums[len / 2 + 1];
        for (int i = 0; i < len; i++) {
            randomNums[i] = (randomNums[i] > middle) ? 0.0f : randomNums[i];
        }
        counter = 0;
        int zeros = 0;
        for (int i = 0; i < len; i++) {
            System.out.printf("%-2.3f ", randomNums[i]);
            counter++;
            if (counter == 8) {
                System.out.println();
            }
            if (randomNums[i] == 0) {
                zeros++;
            }
        }
        System.out.println("\nколичество обнуленных ячеек: " + zeros);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] letters = new char[26];
        len = letters.length;
        char capitalA = 65;
        for (int i = 0; i < len; i++) {
            letters[i] = capitalA;
            capitalA++;
        }
        for (int i = len; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] randNumbers = new int[30];
        len = randNumbers.length;
        int num;
        counter = 0;
        while (counter <=30) {
            num = (int) (Math.random() * (100 - 60)) + 60;
            for (int i = 0; i < len; i++) {
                if(num == randNumbers[i]) {
                    break;
                } else if (randNumbers[i] == 0  || counter == 30) {
                    randNumbers[i] = num;
                    counter++;
                    break;
                } else continue;
            }
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(randNumbers[i] < randNumbers[j]) {
                    int temp = randNumbers[i];
                    randNumbers[i] = randNumbers[j];
                    randNumbers[j] = temp;
                }
            }
        }
        for(int i = 1; i < len + 1; i++) {
            System.out.print(randNumbers[i-1] + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }
        //            for (int i = 0; i < len; i++) {
//                boolean isPresent;
//                do {
//                    isPresent = false;
//                    num = (int) (Math.random() * (100 - 60)) + 60;
//                    for (int j = 0; j < i; j++) {
//                        if (num == randNumbers[j]) {
//                            isPresent = true;
//                            break;
//                        }
//                    }
//                } while (isPresent);
//                randNumbers[i] = num;
//            }

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