package com.startjava.lesson_1.base;

public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        boolean isMac = true;
        char osStartsWith = 'M';
        byte osVersion = 12;
        short memory = 16;
        long graphics = 630L;
        int year = 2019;
        float processor = 2.3f;
        double fullVersion = 12.3;
        System.out.println("Is my laptop Mac? : " + isMac + "\nOS version: " + osVersion + "\nOS Version Letter: " + 
                osStartsWith + "\nMemory in GB: " + memory + "\nGraphics: " + graphics + "\nYear: " + year + 
                "\nProcessor: " + processor + "\nFull version: " + fullVersion + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        double discount = (priceGoodsX + priceGoodsY) / 100 * 11;
        System.out.println("Cуммa скидки: " + discount);
        double discountPrice = priceGoodsX + priceGoodsY - discount;
        System.out.println("Cтоимость товаров со скидкой: " + discountPrice + "\n");

        System.out.println("3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a \n");

        System.out.println("4. Отображение min и max значений числовых типов данных\n");
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;
        System.out.println(byteNum + " " + (++byteNum) + " " + (--byteNum));
        System.out.println(shortNum + " " + (++shortNum) + " " + (--shortNum));
        System.out.println(intNum + " " + (++intNum) + " " + (--intNum));
        System.out.println(longNum + " " + (++longNum) + " " + (--longNum) + "\n");

        System.out.println("5. Перестановка значений переменных\n");
        double num1 = 1;
        double num2 = 2;
        System.out.println("C помощью третьей переменной.\nисходные значения переменных: " + num1 + " " + num2);
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("новые значения переменных: " + num1 + " " + num2 + "\n");
        System.out.println("C помощью арифметических операций.");
        System.out.println("исходные значения переменных: " + num1 + " " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных: " + num1 + " " + num2 + "\n");
        System.out.println("C помощью побитовой операции.\nисходные значения переменных: " + num1 + " " + num2);
        num1 = (int) num1 ^ (int) num2;
        num2 = (int) num1 ^ (int) num2;
        num1 = (int) num1 ^ (int) num2;
        System.out.println("новые значения переменных: " + num1 + " " + num2 + "\n");

        System.out.println("6. Вывод символов и их кодов\n");
        char codeCharOne = 35;
        char codeCharTwo = 38;
        char codeCharThree = 64;
        char codeCharFour = 94;
        char codeCharFive = 95;
        System.out.println((int) codeCharOne + " = " + codeCharOne);
        System.out.println((int) codeCharTwo + " = " + codeCharTwo);
        System.out.println((int) codeCharThree + " = " + codeCharThree);
        System.out.println((int) codeCharFour + " = " + codeCharFour);
        System.out.println((int) codeCharFive + " = " + codeCharFive);

        System.out.println("\n7. Произведение и сумма цифр числа\n");
        int srcNum = 345;
        int firstDigit = srcNum / 100;
        int secondDigit = (srcNum / 10) % 10;
        int thirdDigit = srcNum % 10;
        int product = (firstDigit * secondDigit * thirdDigit);
        int sum = (firstDigit + secondDigit + thirdDigit);
        System.out.println("сумма цифр числа 345 = " + sum);
        System.out.println("произведение цифр числа 345 = " + product);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char unsderscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        char space = ' ';
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" +space + space + space + slash + space + space + backslash);
        System.out.println("" +space + space + slash + unsderscore + openBracket + space + closeBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash);
        System.out.println("" + slash + unsderscore + unsderscore + unsderscore + unsderscore + slash + backslash + 
                unsderscore + unsderscore + backslash + "\n");

        System.out.println("9. Отображение количества сотен, десятков и единиц числа\n");
        int numberN = 123;
        System.out.printf("Число %d содержит: %d сотен, %d десятков, %d единиц\n",
                numberN, numberN / 100, (numberN / 10) % 10, numberN % 10);

        System.out.println("\n10. Преобразование секунд\n");
        int srcSeconds = 86399;
        int hours = srcSeconds / 3600;
        int remainingSeconds = srcSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
        
    }
}