package com.startjava.lesson_2_3.calculator;

public class Calculator {
    
    public static int calculate(int num1, char operation, int num2) {
        int result =
            switch(operation) {
                case '+' -> Math.addExact(num1, num2);
                case '-' -> Math.subtractExact(num1, num2);
                case '*'  -> Math.multiplyExact(num1, num2);
                case '/' -> Math.floorDiv(num1, num2);
                case '^'  -> (int) Math.pow(num1, num2);
                case '%' -> Math.floorMod(num1, num2);
                default -> throw new IllegalStateException("Unexpected value: " + operation);
            };
        return result;
    }

}