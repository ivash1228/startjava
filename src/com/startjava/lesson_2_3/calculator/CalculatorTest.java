package com.startjava.lesson_2_3.calculator;

import java.io.CharConversionException;
import java.util.Random;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesNo = "";

        do {
            System.out.println("Введите математическое выражение: ");
            String[] input = scanner.nextLine().split(" ");
            try {
                int firstOperand = checkInput(Integer.parseInt(input[0]));
                char operationSign = (input[1]).charAt(0);
                int secondOperand = checkInput(Integer.parseInt(input[2]));
                int result = Calculator.calculate(firstOperand, operationSign, secondOperand);
                System.out.printf("%d %c %d = %d\n", firstOperand, operationSign,
                        secondOperand, result);
            } catch (NumberFormatException e) {
                System.out.println("You put negative integer");
            }
            do {
                System.out.println("Хотите продолжить вычисления? ");
                yesNo = scanner.nextLine();
            } while (!yesNo.equals("yes") && !yesNo.equals("no"));
        } while (!yesNo.equals("no"));
    }

    private static int checkInput(int operand) {
        while (operand < 0) {
            System.out.println(operand + " не удовлетворяет условиям, введите корректное значение");
            Scanner sc = new Scanner(System.in);
            operand = sc.nextInt();
        }
        return operand;
    }
}