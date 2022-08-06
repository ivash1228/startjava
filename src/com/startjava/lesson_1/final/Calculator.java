//package com.startjava.lesson_1.final;
//
//public class Calculator {
    
//    public void calculate(char operation, int num1, int num2) {
//        int result = 0;
//        switch(operation) {
//            case '+' :
//                result = num1 + num2;
//                break;
//            case '-' :
//                result =  num1 - num2;
//                break;
//            case '*' :
//                result =  num1 * num2;
//                break;
//            case '/' :
//                if (num2 != 0) {
//                    result =  num1 / num2;
//                }
//                break;
//            case '^' :
//                result = pow(num1, num2);
//                break;
//            case '%' :
//                result =  num1 % num2;
//                break;
//            default:
//                System.out.println("Unknown operation");
//        }
//        System.out.printf("%d %s %d = %d\n", num1, operation, num2, result);
//    }
//
//    private int pow(int num, int power) {
//        int result = 1;
//        while (power > 0) {
//            result *= num;
//            power--;
//        }
//        return result;
//    }
//}
