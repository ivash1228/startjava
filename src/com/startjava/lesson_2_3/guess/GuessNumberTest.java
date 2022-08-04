package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("у каждого игрока по 10 попыток");
        System.out.println("First player name:");
        Player playerOne = new Player(scanner.next());
        System.out.println("Second player name:");
        Player playerTwo = new Player(scanner.next());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        String answer = "";
        do {
            game.start(scanner);
            do {
                System.out.println("Do you want to play one more time?");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}