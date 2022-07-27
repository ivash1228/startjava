package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String yesNo = "";

        do {
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            calc.calculate(operation, num1, num2);
            do {
                System.out.println("Хотите продолжить вычисления? ");
                yesNo = scanner.next();
            } while (!yesNo.equals("yes") && !yesNo.equals("no"));
        } while (!yesNo.equals("no"));
    }
}