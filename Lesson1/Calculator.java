public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        String operation = "^";
        Calculator.doOperation(operation, num1, num2);

    }

    public static void doOperation(String operation, int num1, int num2) {
        if(operation.equals("+")) {
            System.out.printf("%d %s %d = %d\n", num1, operation, num2, num1 + num2);
        } 
        if(operation.equals("-")) {
            System.out.printf("%d %s %d = %d\n", num1, operation, num2, num1 - num2);
        } 
        if(operation.equals("*")) {
            System.out.printf("%d %s %d = %d\n", num1, operation, num2, num1 * num2);
        } 
        if(operation.equals("/")) {
            if(num2 != 0) {
                System.out.printf("%d %s %d = %d\n", num1, operation, num2, num1/num2);
            }
        } 
        if(operation.equals("^")) {
            System.out.printf("%d %s %d = %d\n", num1, operation, num2, toPow(num1, num2));
        }
        if(operation.equals("%")) {
            System.out.printf("%d %s %d = %d\n", num1, operation, num2, num1 % num2);
        } 
    }

    public static int toPow(int num, int power) {
        int result = 1;
        while(power > 0) {
            result = result*num;
            power--;
        }
        return result;
    }
}