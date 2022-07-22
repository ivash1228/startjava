public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        char operation = '%';
        calculate(operation, num1, num2);

    }

    private static void calculate(char operation, int num1, int num2) {
        int result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result =  num1 - num2;
        } else if (operation == '*') {
            result =  num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result =  num1 / num2;
            }
        } else if (operation == '^') {
            result = pow(num1, num2);
        } else {
            result =  num1 % num2;
        }
        System.out.printf("%d %s %d = %d\n", num1, operation, num2, result);
    }

    private static int pow(int num, int power) {
        int result = 1;
        while (power > 0) {
            result *= num;
            power--;
        }
        return result;
    }
}