package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player[] players;
    private int secretNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start(Scanner scanner) {
        generateSecretNumber();
        castLots();
        System.out.println("у каждого игрока по 10 попыток");

        boolean guessed = false;
        while (hasAttempts() && !guessed) {
            for (int i = 0; i < players.length; i++) {
                guessed = makeMove(players[i], scanner);
                if (guessed) break;
            }
        }
        for (Player player : players) {
            if (player.getCountAttempts() == 9) {
                System.out.printf("У %s закончились попытки\n", player.getName());
                break;
            }
        }
        printPlayersNumbers();
        for (Player player : players) {
            player.clear();
        }
    }

    private void generateSecretNumber() {
        secretNumber = new Random().nextInt(10) + 1;
    }

    private void castLots() {
        Random r = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private boolean hasAttempts() {
        for (Player player : players) {
            if (player.getCountAttempts() > 8) {
                return false;
            }
        }
        return true;
    }

    private boolean makeMove(Player player, Scanner scanner) {
        if(inputNumber(player, scanner)) {
            if (isGuessed(player)) {
                printSuccessMessage(player);
                return true;
            }
        } return false;
    }

    private boolean inputNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + ", put your number: ");
        int guess = scanner.nextInt();
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
        System.out.printf("Игрок %s угадал число %d с %d попытки\n",
                player.getName(), secretNumber, player.getCountAttempts() + 1 );
    }

    private void printPlayersNumbers() {
        for (Player player: players) {
            System.out.print(player.getName() + " numbers are: ");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}