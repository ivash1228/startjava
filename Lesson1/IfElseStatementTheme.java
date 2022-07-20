public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        String name = "Joe";
        int age = 18;
        double height = 1.87;
        boolean isMale = true;

        if (age > 20) {
            System.out.println("A person can't get a candy");
        } else {
            System.out.println("A person can get a candy");
        }

        if (!isMale) {
            System.out.println("A person is a Female");
        } else {
            System.out.println("A person is a Male");
        }

        if (height < 1.8) {
            System.out.println("A person is tall");
        } else {
            System.out.println("A person is of average height");
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("A person's name could be Maria.");
        } else if (firstLetterName == 'I') {
            System.out.println("A person's name could be Isaak.");
        } else {
            System.out.println("A person's name could be any name.\n");
        }

        System.out.println("2 Поиск max и min числа\n");

        int num1 = 5;
        int num2 = 29;
        if (num1 > num2) {
            System.out.printf("максимальное число: %d, минимальное число: %d\n", num1, num2);
        } else {
            System.out.printf("максимальное число: %d, минимальное число: %d\n", num2, num1);
        }

        System.out.println("\n3. Работа с числом\n");

        int num = 45;
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("This number is even");
            } else {
                System.out.println("This number is odd");
            }
            if (num < 0) {
                System.out.println("This number is negative");
            } else {
                System.out.println("This number is positive");
            }
        } else {
            System.out.println("This number is 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 534;
        num2 = 534;
        int digit = 0;
        int place = 0;
        if(num1 % 10 == num2 % 10) {
            digit = num1 % 10;
            place = 3;
            System.out.printf("We have two numbers: %d and %d. They have a common digit %d in a %d place\n", num1, num2, digit, place);
        }
        if ((num1 / 10) % 10 == (num2 / 10) % 10) {
            digit = (num1 / 10) % 10;
            place = 2;
            System.out.printf("We have two numbers: %d and %d. They have a common digit %d in a %d place\n", num1, num2, digit, place);
        }
        if (num1 / 100 == num2 / 100) {
            digit = num1 / 100;
            place = 1;
            System.out.printf("We have two numbers: %d and %d. They have a common digit %d in a %d place\n", num1, num2, digit, place);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char code = '\u0057';
        if ('0' <= code && code <= '9') {
            System.out.printf("%c %s\n", code, "Integer");
        } else if ('A' <= code && code <= 'Z') {
            System.out.printf("%c %s\n", code, "Uppercase Letter");
        } else if ('a' <= code && code <= 'z') {
            System.out.printf("%c %s\n", code, "Lowercase Letter");
        } else {
            System.out.printf("%c %s\n", code, "Special Character");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");

        int depositAmount = 300000;
        int divident = 0;
        if (depositAmount < 100000) {
            divident = (depositAmount / 100) * 5;
        } else if (depositAmount < 300000) {
            divident = (depositAmount / 100) * 7;
        } else {
            divident = (depositAmount / 100) * 10;
        }
        System.out.printf("сумма вклада: %d, начисленный: %d, итоговая сумма: %d\n", depositAmount, divident, depositAmount + divident);

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyScore = 59; 
        int codingScore = 91;
        int historyGrade = getScore(historyScore);
        int codingGrade = getScore(codingScore);
        System.out.println(historyGrade + " " + "History");
        System.out.println(codingGrade + " " + "Coding");
        System.out.println("средний балл оценок по предметам: " + (historyScore + codingScore) / 2);
        System.out.println("средний % по предметам: " + (historyGrade + codingGrade) / 2);

        System.out.println("\n8. Расчет прибыли\n");

        int rent = 5000;
        int sales = 13000;
        int purchasePrice = 9000;
        int oneMonth = 13000 - 9000 - 5000;
        System.out.printf("прибыль за год: %d руб.\n", oneMonth * 12);

        System.out.println("\n9. Подсчет количества банкнот\n");

        int amountToWithdraw = 567;
        int tenDollarBillATM = 5;
        int oneDollarBill = amountToWithdraw % 10;
        int tenDollarBill = (amountToWithdraw / 10) % 10;
        int hundredDollarBill = amountToWithdraw / 100;

        if (tenDollarBillATM < tenDollarBill) {
            oneDollarBill += (tenDollarBill - tenDollarBillATM) * 10;
            tenDollarBill = tenDollarBillATM;
        }

        int totaToWithdraw = (hundredDollarBill * 100) + (tenDollarBill * 10) + oneDollarBill;

        System.out.printf("ATM will dispense %d $100 bills, %d $10 bills, %d $1 bills\n", hundredDollarBill, tenDollarBill, oneDollarBill);
        System.out.printf("You will withdraw $%d from your account\n", totaToWithdraw);
    }

    public static int getScore(int number) {
                int score = 0;
                if (number > 91) {
                    score = 5;
                } else if (number > 73) {
                    score = 4;
                } else if (number > 60) {
                    score = 3;
                } else {
                    score = 2;
                }
                return score;
            }
}