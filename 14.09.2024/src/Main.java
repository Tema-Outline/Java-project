import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
//        checkEvenOdd(55555);
//        findMin(33, 44, 11);
//        multiplicationTable();
//        sumOfNumbers(5);
//        fibonacciFunk(4);
//        checkNum(4);
//        reverseNumbers(415);
        sumOfEvenNumbers(1, 6);
        reverseString("abcdef");
    }

    // Задача 1: Четное или нечетное число
    public static void checkEvenOdd(int num)
    {
        System.out.println("\nЗадача 1: Четное или нечетное число");
        if (num % 2 == 0)
        {
            System.out.println(num + " - " + "Четное число");
        }
        else
        {
            System.out.println(num + " - " + "Нечетное число");
        }
    }

    // Задача 2: Минимальное из трех чисел
    public static void findMin(int num1, int num2, int num3)
    {
        System.out.println("\nЗадача 2: Минимальное из трех чисел");
        Stream<Integer> numbers = Stream.of(-10, 2, 3);
        Optional<Integer> correctMin = numbers.min(Integer::compare); // Правильный подход!
        System.out.println("Минимальное число: " + correctMin.get());

        //int min = Math.min(num1, num2);
        //min = Math.min(min, num3);
        //System.out.println("Минимальное число: " + min);
    }

    // Задача 3: Таблица умножения
    public static void multiplicationTable()
    {

        System.out.println("\nЗадача 3: Таблица умножения");
        int num = 5;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // Задача 4: Сумма чисел от 1 до N
    public static void sumOfNumbers(int num)
    {
        System.out.println("\nЗадача 4: Сумма чисел от 1 до N");
        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + num + ": " + sum);
    }

    // Задача 5: Число Фибоначчи
    public static void fibonacciFunk(int n)
    {
        System.out.println("\nЗадача 5: Число Фибоначчи");
        int a = 0;
        int b = 1;
        int temp;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }
    }

    // Задача 6: Проверка простого числа
    public static void checkNum(int num)
    {
        System.out.println("\nЗадача 6: Проверка простого числа");
        if (num <= 1)
        {
            System.out.println(num + " - не простое число");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                System.out.println(num + " - не простое число");
                return;
            }
        }
        System.out.println(num + " - простое число");
    }

    // Задача 7: Обратный порядок числа
    public static void reverseNumbers(int num)
    {
        System.out.println("\nЗадача 7: Обратный порядок числа");
        System.out.print("Число " + num + " в обратном порядке: ");
        System.out.println(new StringBuilder(Integer.toString(num)).reverse());
    }

    // Задача 8: Сумма четных чисел
    public static void sumOfEvenNumbers(int a, int b)
    {
        System.out.println("\nЗадача 8: Сумма четных чисел");
        int sum = 0;
        for (int i = a; i <= b; i++)
        {
            if (i % 2 == 0)
            {
                sum += i;
            }
        }

        System.out.println("Сумма четных чисел в диапазоне от " + a + " до " + b + ": " + sum);
    }

    // Задача 9: Реверс строки
    public static void reverseString(String str)
    {
        System.out.println("\nЗадача 9: Реверс строки");
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println("Обратная строка: " + reversedString);
    }

    // Задача 10: Количество цифр в числе
    public static void countDigits(int num) {
        int count = 0;

        if (num == 0) {
            count = 1; // Обработка случая, когда число равно 0
        }

        else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Количество цифр в числе: " + count);
    }

    // Задача 11: Факториал числа
    public static void factorial(int num) {
        if (num < 0) {

            System.out.println("Факториал не определен для отрицательных чисел.");

            return;
        }

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Факториал " + num + "! равен: " + factorial);
    }

    // Задача 12: Сумма цифр числа
    public static void sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {

            sum += num % 10;

            num /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    // Задача 13: Палиндром
    public static void checkPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s", "");

        int left = 0;

        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Строка является палиндромом." : "Строка не является палиндромом.");

    }

    // Задача 14: Найти максимальное число в массиве
    public static void findMax(int[] array) {
        if (array.length == 0) {

            System.out.println("Массив пуст.");
            return;
        }

        System.out.println("Максимальное число в массиве: " + Arrays.stream(array).max().getAsInt());
    }

    // Задача 15: Сумма всех элементов массива
    public static void sumOfArray(int[] array) {
        if (array.length == 0) {

            System.out.println("Массив пуст.");
            return;
        }

        System.out.println("Сумма всех элементов массива: " +  Arrays.stream(array).sum());
    }

    // Задача 16: Количество положительных и отрицательных чисел
    public static void countPositiveNegative(int[] array) {
        int positiveCount = 0;

        int negativeCount = 0;

        for (int j : array) {
            if (j > 0) {
                positiveCount++;
            }
            else if (j < 0) {
                negativeCount++;
            }
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }

    // Задача 17: Простые числа в диапазоне
    public static void printPrimes(int num1, int num2) {
        if (num1<2 && num2<2 ) {
            System.out.println("Простых чисел нет!" );
            return;
        }

        if (num1 < 2) {
            num1 = 2; // Начинаем с 2, так как 1 не простое число
        }

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Задача 18: Подсчет гласных и согласных в строке
    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();

        int vowelCount = 0;

        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' ||
                        ch == 'а' || ch == 'о' || ch == 'е' || ch == 'ё' || ch == 'и' ||
                        ch == 'ю' || ch == 'у' || ch == 'э' || ch == 'ы' || ch == 'я' ) {
                    vowelCount++;
                }
                else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
    }

    // Задача 19: Перестановка слов в строке
    public static void reverseWords(String str) {
        String[] words = str.split(" ");

        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }

    // Задача 20: Число Армстронга
    public static void checkArmstrong(int num) {
        int originalNum = num;

        int digitsCount = 0;

        int sum = 0;

        // Подсчет количества цифр
        while (num > 0) {
            digitsCount++;
            num /= 10;
        }

        num = originalNum; // Восстановление исходного числа

        // Вычисление суммы цифр в степени
        while (num > 0) {

            int digit = num % 10;

            sum += (int) Math.pow(digit, digitsCount);

            num /= 10;
        }

        System.out.println(sum==originalNum ? (originalNum + " - число Армстронга.") : (originalNum + " - не число Армстронга."));
    }
}