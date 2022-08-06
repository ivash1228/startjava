package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    
    public static String calculate(String str) {
        String[] input = str.split(" ");
        int firstOperand = checkOperand(input[0]);
        char operationSign = (input[1]).charAt(0);
        int secondOperand = checkOperand(input[2]);
        return switch(operationSign) {
            case '+' -> " " + firstOperand + " " + operationSign + " " + secondOperand
                    + " = " + Math.addExact(firstOperand, secondOperand);
            case '-' -> " " + firstOperand + " " + operationSign + " " + secondOperand
                    + " = " + Math.subtractExact(firstOperand, secondOperand);
            case '*'  -> " " + firstOperand + " " + operationSign + " " + secondOperand
                    + " = " + Math.multiplyExact(firstOperand, secondOperand);
            case '/' -> " " + firstOperand + " " + operationSign + " " + secondOperand
                    + " = " + Math.floorDiv(firstOperand, secondOperand);
            case '^'  -> " " + firstOperand + " " + operationSign + " " + secondOperand
                    + " = " + Math.pow(firstOperand, secondOperand);
            case '%' -> " " + firstOperand + " " + operationSign + " " + secondOperand
                    + " = " + Math.floorMod(firstOperand, secondOperand);
            default -> throw new IllegalStateException("Unexpected value: " + operationSign);
        };
    }

    private static int checkOperand(String operand) {
        int validOperand = Integer.parseInt(operand);
        while (validOperand < 0 || validOperand % 1 != 0) {
            System.out.println(operand + " не удовлетворяет условиям, введите корректное значение");
            Scanner sc = new Scanner(System.in);
            validOperand = Integer.parseInt(sc.nextLine());
        }
        return validOperand;
    }
}