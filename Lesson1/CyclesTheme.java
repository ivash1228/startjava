public class CyclesTheme {
    
    public static void main(String[] args) {

    System.out.println("1. Подсчет суммы четных и нечетных чисел");

    int[] numbers = {-10, -4, 2, 4, 17, 21};
    int evenSum = 0;
    int oddSum = 0;
    int counter = 0;
    do {
        if(numbers[counter]%2 == 0){
            evenSum += numbers[counter];
        } else {
            oddSum += numbers[counter];
        }
        counter++;
    }
    while(counter < 6);
    System.out.printf("B промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n", evenSum, oddSum);

    System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
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

    for(int start = max; start > min + 1; start--) {
        System.out.print(start - 1 + " ");
    }
    System.out.println("");
    System.out.println("3. Вывод реверсивного числа и суммы его цифр");

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
    System.out.printf("%d, %d\n", newNumber, newSum);

    System.out.println("4. Вывод чисел на консоль в несколько строк");

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

    System.out.println("5. Проверка количества единиц на четность");
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
        evenOdd = "even";
    } else {
        evenOdd = "odd";
    }

    System.out.printf("число 3141591 содержит %s количество единиц\n", evenOdd);

    System.out.println("6. Отображение фигур в консоли");

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
  }
}