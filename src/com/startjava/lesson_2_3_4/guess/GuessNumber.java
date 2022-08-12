package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public Player[] players;
    private int secretNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start(Scanner scanner) {
        generateSecretNumber();
        assignOrder();
        System.out.println("у каждого игрока по 10 попыток");

        boolean isGuessed = false;
        while (hasAttempts() && !isGuessed) {
            for (int i = 0; i < players.length; i++) {
                if (inputNumber(players[i], scanner)) {
                    if (isGuessed(players[i])) {
                        isGuessed = true;
                        printSuccessMessage(players[i]);
                        break;
                    }
                } players[i].addCountAttempts();
            }
        }
        for (Player player : players) {
            if(player.getCountAttempts() == 9 && !isGuessed) {
                System.out.printf("У %s закончились попытки\n", player.getName());
                isGuessed = true;
            }
            printPlayerNumbers(player);
            player.resetNumbers();
        }
    }

    public boolean hasAttempts() {
        for (Player player : players) {
            if (player.getCountAttempts() > 9) {
                return false;
            }
        }
        return true;
    }

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
        int guess = scanner.nextInt();
        if (guess > 100 || guess < 0 ) {
            System.out.println("You put invalid number, now it is next player's turn");
            return false;
        }
        return player.addNumber(guess);
    }

    private boolean isGuessed(Player player) {
        if (player.getLastNumber() == secretNumber) {
            return true;
        }
        System.out.print("Your number is ");
        System.out.println((player.getLastNumber() < secretNumber) ? "less" : "greater");
        return false;
    }

    private void printSuccessMessage(Player player) {
        player.addCountAttempts();
        System.out.printf("Игрок %s угадал число %d с %d попытки\n",
                player.getName(), secretNumber, player.getCountAttempts() + 1);
    }

    private void printPlayerNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}