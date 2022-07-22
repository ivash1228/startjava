public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int sumEven = 0;
        int sumOdd = 0;
        for(int i = -10; i <= 21; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.printf("B промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n",
                sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        if (num3 > max) {
            max = num3;
        } else if (num2 > max) {
            max = num2;
        } else {
            max = num1;
        }
        if (num3 < min) {
            min = num3;
        } else if (num1 < min) {
            min = num1;
        } else {
            min = num2;
        }
        for(int i = --max; i > min + 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int srcNumber = 1234;
        int reverceSrcNumber = 0;
        int sumDigits = 0;
        while(srcNumber > 0) {
            int digit = srcNumber % 10;
            sumDigits += digit;
            srcNumber /= 10;
            reverceSrcNumber = reverceSrcNumber * 10 + digit;
        }
        System.out.printf("исходное число в обратном порядке: %d, сумма его цифр: %d\n", 
                reverceSrcNumber, sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int count = 0;
        for(int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        while(count < 5) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        srcNumber = 3141591;
        int num = srcNumber;
        int ones = 0;
        String evenOdd;
        while(srcNumber > 0) {
            if(srcNumber % 10 == 1) {
                ones++;
            }
            srcNumber /= 10;
        }
        if(ones / 2 == 0) {
            evenOdd = "четное";
        } else {
            evenOdd = "нечетное";
        }

        System.out.printf("число %d содержит %d (%s) количество единиц\n", num, ones, evenOdd);

        System.out.println("\n6. Отображение фигур в консоли\n");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        int hashtagCounter = 5;
        int line = 5;
        while (hashtagCounter > 0) {
            System.out.print("#");
            hashtagCounter--;
            if (hashtagCounter == 0) {
                line--;
                System.out.println();
                hashtagCounter = line;
            }
        }
        System.out.println();

        int signCounter = 1;
        int lineNum = 1;
        int backCounter = 0;
        do {
            System.out.print("$"); 
            signCounter--;
            if (signCounter == 0) {
                System.out.println("");
                lineNum++;
                if (lineNum < 4) {
                    signCounter = lineNum;
                    backCounter = lineNum;
                } else {
                    signCounter = backCounter - 1;
                    backCounter -= 1;
                }
            }
        } while (lineNum < 6);

        // do {
        //     System.out.print("$");
        //     signCounter--;
    //         if (signCounter == 0) {
    //             lineNum++;
    //             System.out.println("");
    //             signCounter = lineNum;
    //         }
    //         if (lineNum == 3) {
    //             do {
    //                 signCounter--;
    //                 System.out.print("$");
//                     if (signCounter == 0) {
//                         lineNum--;
//                         System.out.println("");
//                         signCounter = lineNum;
//                     }
    //             } while (lineNum > 0);
    //         }
        // } while (lineNum > 0);

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int srcNum = 1234321;
        int reversedNumber = 0;
        int copySrcNum = srcNum;
        while (copySrcNum != 0) {
            int digit = copySrcNum % 10;
            reversedNumber = reversedNumber * 10 + digit;
            copySrcNum /= 10;
        }
        if (reversedNumber == srcNum) {
                System.out.printf("число %d является палиндромом\n", srcNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");

        int luckyNumber = 123114;
        int firstHalf = luckyNumber / 1000;
        int secondHalf = luckyNumber % 1000;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        while(firstHalf > 0 && secondHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            sumSecondHalf += secondHalf % 10;
            firstHalf /= 10;
            secondHalf /= 10;
        }
        firstHalf = luckyNumber / 1000;
        secondHalf = luckyNumber % 1000;
        System.out.printf("Сумма цифр %d = %d\n", firstHalf, sumFirstHalf);
        System.out.printf("Сумма цифр %d = %d\n", secondHalf, sumSecondHalf);
        if (sumFirstHalf == sumSecondHalf){
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("\n 10. Вывод таблицы умножения Пифагора\n");

        System.out.printf("%22s\n\n", "таблица Пифагора");

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("  ");
                } else if (i == 1) {
                    System.out.print("---");
                } else if (j == 1) {
                    System.out.printf("%2c", '|');
                } else if (i == 0) {
                    System.out.printf("%3d", j);
                } else if (j == 0) {
                    System.out.printf("%2d", i);
                }
                else {
                    System.out.printf("%3d", i*j);
                }
            } System.out.println("");
        }
    }
}



