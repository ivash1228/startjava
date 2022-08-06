package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    
    public Player playerOne;
    public Player playerTwo;
    private int secretNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start(Scanner scanner) {
        generateSecretNumber();
        do {
            if (playerOne.getCountAttempts() < 10) {
                inputNumber(playerOne, scanner);
                if (isGuessed(playerOne)) {
                    successMessage(playerOne);
                    break;
                }
            } else {
                System.out.printf("У %s закончились попытки\n", playerOne.getName());
                break;
            }
            inputNumber(playerTwo, scanner);
            if (isGuessed(playerTwo)) {
                successMessage(playerTwo);
                break;
            }
        } while (true);
        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.resetNumbers();
        playerTwo.resetNumbers();
    }


    private void generateSecretNumber() {
        secretNumber = new Random().nextInt(10) + 1;
    }

    private void inputNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + ", put your number: ");
        player.addNumber(player.getCountAttempts(), scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        int playerNumber = player.getNumbers()[player.getCountAttempts() - 1];

        if (playerNumber == secretNumber) {
            return true;
        }
        if (playerNumber < secretNumber) {
            System.out.println("Your number is less.");
        } else {
            System.out.println("Your number is greater.");
        }
        return false;
    }

    private void successMessage(Player player) {
        System.out.printf("Игрок %s угадал число %d с %d попытки\n",
                player.getName(), secretNumber, player.getCountAttempts());
    }

    private void printPlayerNumbers(Player player) {
        int[] numbers = player.getNumbers();
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}