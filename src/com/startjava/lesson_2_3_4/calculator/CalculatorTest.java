package com.startjava.lesson_2_3_4.calculator;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                try {
                    int result = Calculator.calculate(expression);
                    System.out.println(expression + " = " + result);
                } catch (NumberFormatException e) {
                    System.out.println("You put other sign instead of number");
                } catch (IllegalStateException e) {
                    System.out.println("You put incorrect operation sign");
                }
            }
            System.out.println("Хотите продолжить вычисления? ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}