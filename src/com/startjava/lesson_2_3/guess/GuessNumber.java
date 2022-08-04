package com.startjava.lesson_2_3.guess;

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
            if (playerOne.getCounter() < 10) {
                playerTurn(playerOne, scanner);
                if (isGuessed(playerOne)) {
                    successMessage(playerOne);
                    break;
                }
            } else {
                System.out.printf("У %s закончились попытки\n", playerOne.getName());
                break;
            }
            playerTurn(playerTwo, scanner);
            if (isGuessed(playerTwo)) {
                successMessage(playerTwo);
                break;
            }
        } while (true);
        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.emptyArray();
        playerTwo.emptyArray();
    }

    private void playerTurn(Player player, Scanner scanner) {
            System.out.println(player.getName() + ", put your number: ");
            player.setNumber(player.getCounter(), scanner.nextInt());
    }

    private void generateSecretNumber() {
        secretNumber = new Random().nextInt(10) + 1;
    }

    private boolean isGuessed(Player player) {
        int[] playerNumbers = player.getNumbers();
        int playerNumber = playerNumbers[player.getCounter()];
        boolean result = false;
        if (playerNumber == secretNumber) {
            result = true;
        } else if (playerNumber < secretNumber) {
            System.out.println("Your number is less.");
        } else {
            System.out.println("Your number is greater.");
        }
        player.increaseCounter();
        return result;
    }

    private void successMessage(Player player) {
        System.out.printf("Игрок %s угадал число %d с %d попытки\n",
                player.getName(), secretNumber, player.getCounter());
    }

    private void printPlayerNumbers (Player player) {
        int[] toPrint = Arrays.copyOf(player.getNumbers(), player.getCounter());
        for (int num : toPrint) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}