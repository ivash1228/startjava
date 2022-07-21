public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int evenSum = 0;
        int oddSum = 0;
        for(int i = -10; i <= 21; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.printf("B промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n", evenSum, oddSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int[] nums  = {10, 5, -1};
        int max;
        int min;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
             }
        }
        max = nums[2];
        min = nums[0];

        for(int i = max; i > min + 1; i--) {
            System.out.print(i - 1 + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int oldNumber = 1234;
        int newNumber = 0;
        int newSum = 0;
        int multy = 10;
        while(oldNumber > 0) {
            int temp = oldNumber % multy;
            newSum += temp;
            oldNumber = oldNumber/multy;
            newNumber = newNumber*multy + temp;
        }
        System.out.printf("исходное число в обратном порядке: %d, сумма его цифр: %d\n", newNumber, newSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        for(int i = 1; i < 24; ) {
            int count = 0;
            do {
                System.out.printf("%-2d ", i);
                i+=2;
                count++;
            }
            while(count < 5 && i < 24);
            if(i >= 24) {
                while(count < 5) {
                    System.out.printf("%-2d ", 0);
                    count++;
                }
            }
            System.out.println("");
        }

        System.out.println("\n5. Проверка количества единиц на четность\n");
        int givenNum = 3141591;
        int ones = 0;
        String evenOdd;
        while(givenNum > 0) {
            if(givenNum % 10 == 1) {
                ones++;
            }
            givenNum = givenNum/10;
        }
        if(ones/2==0) {
            evenOdd = "четное";
        } else {
            evenOdd = "нечетное";
        }

        System.out.printf("число 3141591 содержит %s количество единиц\n", evenOdd);

        System.out.println("\n6. Отображение фигур в консоли\n");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        int poundSign = 5;
        int line = 5;
        while(poundSign > 0) {
            System.out.print("#");
            poundSign--;
            if(poundSign == 0){
                line--;
                System.out.println("");
                poundSign = line;
            }
        }
        System.out.println("");

        int signCounter = 1;
        int lineNum = 1;
        do {
            System.out.print("$");
            signCounter--;
            if(signCounter == 0){
                lineNum++;
                System.out.println("");
                signCounter = lineNum;
            }
        } while(lineNum < 3); // now sign = 3 
        do {
                System.out.print("$");
                signCounter--;
                if(signCounter == 0){
                    lineNum--;
                    System.out.println("");
                    signCounter = lineNum;
                }
            } while(lineNum > 0);

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int srcNum = 1234321;
        int reversedNumber = 0;
        int temp = srcNum;
        while (temp != 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp /= 10;
        }
        if (reversedNumber == srcNum) {
            System.out.printf("число %d является палиндромом\n", srcNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");

        int luckyNumber = 123115;
        int firstHalf = luckyNumber / 1000;
        int secondHalf = luckyNumber % 1000;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        while(firstHalf > 0 && secondHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            sumSecondHalf += secondHalf % 10;
            firstHalf /=  10;
            secondHalf /= 10;
        }
        firstHalf = luckyNumber / 1000;
        secondHalf = luckyNumber % 1000;
        System.out.printf("Сумма цифр %d = %d\n", firstHalf, sumFirstHalf);
        System.out.printf("Сумма цифр %d = %d\n", secondHalf, sumSecondHalf);
        if (sumFirstHalf == sumSecondHalf){
            System.out.println("число является счастливым");
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



