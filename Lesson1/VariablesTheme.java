public class VariablesTheme {
    
    public static void main (String[] args) {

        System.out.println("Создание переменных и вывод их значений на консоль\n");
        boolean isMac = true;
        char osStartsWith = 'M';
        byte osVersion = 12;
        short memory = 16;
        long graphics = 630L;
        int year = 2019;
        float processor = 2.3f;
        double fullVersion = 12.3;
        System.out.println(isMac + " " + osVersion + " " + osStartsWith + " " + memory + " " + graphics + " " + year + " " + processor + " " + fullVersion + "\n");

        System.out.println("Расчет стоимости товара со скидкой\n");
        int first = 100;
        int second = 200;
        double rebate = (first+second)/100*11;
        System.out.println("Skidka = " + rebate);
        double total = first + second - rebate;
        System.out.println("Your price is " + total + "\n");

        System.out.println("Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");

        System.out.println("Отображение min и max значений числовых типов данных\n");
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;
        System.out.println(byteNum + " " + (byteNum + 1) + " " + (byteNum - 1));
        System.out.println(shortNum + " " + (shortNum + 1) + " " + (shortNum - 1));
        System.out.println(intNum + " " + (intNum + 1) + " " + (intNum - 1));
        System.out.println(longNum + " " + (longNum + 1) + " " + (longNum - 1) + "\n");

        System.out.println("Перестановка значений переменных\n");
        double num1 = 1.1;
        double num2 = 2.2;
        System.out.println("C помощью третьей переменной.\nисходные значения переменных: " + num1 + " " + num2);
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("новые значения переменных: " + num1 + " " + num2 + "\n");
        System.out.println("C помощью арифметических операций.\nисходные значения переменных: " + num1 + " " + num2);
        num1 = num1 - num2;
        num2 = num2 + num1;
        System.out.println("новые значения переменных: " + num1 + " " + num2 + "\n");
        // System.out.println("C помощью побитовой операции.\nисходные значения переменных: " + num1 + " " + num2 + "\n");
        // temp = num2 ^ num1;
        // num2 =  num1 ^ num2;
        // num1 = temp ^ num2;
        // System.out.println("новые значения переменных: " + num1 + " " + num2 + "\n");

        System.out.println("Вывод символов и их кодов\n");
        int[] chars = {35, 38, 64, 94, 95};
        for (int i = 0; i < 5; i++){
            System.out.println(chars[i] + " = " + (char)chars[i]);
        }
        System.out.println("");

        System.out.println("Произведение и сумма цифр числа\n");
        int num = 345;
        int product = ((num/100) * (num%100) * (num%10));
        int sum = ((num/100) + (num%100) + (num%10));
        System.out.println("сумма цифр числа 345 = " + sum);
        System.out.println("произведение цифр числа 345 = " + product);
        System.out.println("\n\n\n");
    }

    
}