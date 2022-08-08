package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First player name:");
        Player playerOne = new Player(scanner.next());
        System.out.println("Second player name:");
        Player playerTwo = new Player(scanner.next());
        System.out.println("Third player name:");
        Player playerThree = new Player(scanner.next());
        GuessNumber game = new GuessNumber(playerOne, playerTwo, playerThree);
        game.assignOrder();
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start(scanner);
            }
            System.out.println("Do you want to play one more time? [yes/no]");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}