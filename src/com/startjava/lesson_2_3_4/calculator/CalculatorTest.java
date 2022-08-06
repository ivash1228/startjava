package com.startjava.lesson_2_3_4.calculator;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesNo = "";

        do {
            System.out.println("Введите математическое выражение: ");
            String input = scanner.nextLine();
            try {
                System.out.println(Calculator.calculate(input));
            } catch (IllegalStateException e) {
                System.out.println("You put incorrect operation sign");
            } catch (NumberFormatException e) {
                System.out.println("You put other sign instead of number");
            }
            do {
                System.out.println("Хотите продолжить вычисления? ");
                yesNo = scanner.nextLine();
            } while (!yesNo.equals("yes") && !yesNo.equals("no"));
        } while (!yesNo.equals("no"));
    }
}