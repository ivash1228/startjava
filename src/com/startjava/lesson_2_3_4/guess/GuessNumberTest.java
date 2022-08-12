package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        for(int i = 0; i < 3; i++) {
            System.out.println("Put "+ (i + 1) +  " player name:");
            players[i] = new Player(scanner.next());
        }

        GuessNumber game = new GuessNumber(players);

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