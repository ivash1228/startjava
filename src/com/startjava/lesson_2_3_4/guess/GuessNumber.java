package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public Player[] players = new Player[3];
    private int secretNumber;

    public GuessNumber(Player playerOne, Player playerTwo, Player playerThree) {
        players[0] = playerOne;
        players[1] = playerTwo;
        players[2] = playerThree;
    }

    public void start(Scanner scanner) {
        generateSecretNumber();
        System.out.println("у каждого игрока по 10 попыток");
        OUTER_LOOP:
        while ((players[0].getCountAttempts() < 10
                && players[1].getCountAttempts() < 10
                && players[2].getCountAttempts() < 10)) {
                    for (int i = 0; i < players.length; i++) {
                        if (inputNumber(players[i], scanner)) {
                            if (isGuessed(players[i])) {
                                returnSuccessMessage(players[i]);
                                break OUTER_LOOP;
                            }
                        }
                    }
                }
        for (Player player : players) {
            if(player.getCountAttempts() == 10) {
                System.out.printf("У %s закончились попытки\n", player.getName());
            }
            printPlayerNumbers(player);
            player.resetNumbers();
        }
    }


//            if (playerTwo.getCountAttempts() < 10) {
//                inputNumber(playerTwo, scanner);
//                if (isGuessed(playerTwo)) {
//                    returnSuccessMessage(playerTwo);
//                    break;
//                }
//            } else {
//                System.out.printf("У %s закончились попытки\n", playerTwo.getName());
//                break;
//            }


    public void assignOrder() {
        Random r = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int j = r.nextInt(i+1);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private void generateSecretNumber() {
        secretNumber = new Random().nextInt(10) + 1;
    }

    private boolean inputNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + ", put your number: ");
        return player.addNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        if (player.getLastNumber() == secretNumber) {
            return true;
        }
        System.out.print("Your number is ");
        System.out.println((player.getLastNumber() < secretNumber) ? "less" : "greater");
        return false;
    }

    private void returnSuccessMessage(Player player) {
        System.out.printf("Игрок %s угадал число %d с %d попытки\n",
                player.getName(), secretNumber, player.getCountAttempts());
    }

    private void printPlayerNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}