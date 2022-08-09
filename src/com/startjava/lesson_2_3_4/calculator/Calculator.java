package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    
    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int a = checkOperand(partsExpression[0]);
        char sign = (partsExpression[1]).charAt(0);
        int b = checkOperand(partsExpression[2]);
        return switch(sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*'  -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '^'  -> (int) Math.pow(a, b);
            case '%' -> Math.floorMod(a, b);
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
    }

    private static int checkOperand(String operand) {
        int validOperand = Integer.parseInt(operand);
        Scanner sc = new Scanner(System.in);
        while (validOperand < 0 || validOperand % 1 != 0) {
            System.out.println(operand + " не удовлетворяет условиям, введите корректное значение");
            validOperand = Integer.parseInt(sc.nextLine());
        }
        return validOperand;
    }
}