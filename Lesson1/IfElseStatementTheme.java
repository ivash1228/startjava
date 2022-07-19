public class IfElseStatementTheme {
    
    public static void main(String[] args) {

        System.out.println("1. Перевод псевдокода на язык Java");

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
            System.out.println("A person's name could be anything. Literally anything!\n");
        }

        System.out.println("2 Поиск max и min числа");

        int num1 = 5;
        int num2 = 29;
        if (num1 > num2) {
            System.out.printf("Mаксимальное число: %d, Mинимальное число: %d\n", num1, num2);
        } else {
            System.out.printf("Mаксимальное число: %d, Mинимальное число: %d\n", num2, num1);
        }

        System.out.println("3. Работа с числом");

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

        System.out.println("4. Поиск одинаковых цифр в числах");
        num1 = 234;
        num2 = 335;
        int digit = 0;
        int place = 0;
        if(num1 % 10 == num2 % 10) {
            digit = num1 % 10;
            place = 3;
        } else if ((num1/10) % 10 == (num2/10) % 10){
            digit = (num1/10) % 10;
            place = 2;
        } else if (num1 / 100 == num2 / 100) {
            digit = num1 / 100;
            place = 1;
        }
        if (place != 0) {
            System.out.printf("We have two numbers: %d %d. They have a common digit %d in a %d place\n", num1, num2, digit, place);
        }

        System.out.println("5. Определение буквы, числа или символа по их коду");

        char code = '\u0057';
        String number;
        if (48 <= code && code <= 57) {
            number = "Integer";
        } else if (65 <= code && code <= 90) {
            number = "Uppercase Letter";
        } else if (97 <= code && code <= 122) {
            number = "Lowercase Letter";
        } else {
            number = "Special Character";
        }
        System.out.println(code + " " + number);

        System.out.println("6. Определение суммы вклада и начисленных банком %");

        int depositAmount = 300000;
        int divident = 0;
        if (depositAmount < 100000) {
            divident = (depositAmount/100) * 5;
        } else if (depositAmount < 300000) {
                divident = (depositAmount/100) * 7;
        } else {
                divident = (depositAmount/100) * 10;
        }
        System.out.printf("суммa вклада: %d, начисленный: %d, итоговa суммa: %d\n", depositAmount, divident, depositAmount + divident);


        System.out.println("7. Определение оценки по предметам");
        int hist = 59;
        int progr = 91;
        int histGrade = getScore(hist);
        int codingGrade = getScore(progr);

        System.out.println(histGrade + " " + "History");
        System.out.println(codingGrade + " " + "Coding");
        System.out.println((hist + progr)/2);
        System.out.println((histGrade + codingGrade)/2);

        System.out.println("8. Расчет прибыли");

        int rent = 5000;
        int sales = 13000;
        int purchasePrice = 9000;

        int oneMonth = 13000 - 9000 - 5000;
        System.out.printf("прибыль за год: %d\n", oneMonth * 12);
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