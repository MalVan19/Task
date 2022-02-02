package Decomposition;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.\n" +
                        "Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию");
        String str;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            str = scanner.nextLine();
            if (isNum(str)) {
                break;
            } else {
                System.out.println("Ошибка! Попытайтесь еще раз");
            }
        }
        char[] numbers = str.toCharArray();
        getSumOdd(numbers);

    }

    private static boolean isNum(String str) {
        return str.matches("\\d+");
    }

    static void getSumOdd(char[] arr) {
        int sum = 0;
        int count = 0;
        for (char c : arr) {
            int value = Character.getNumericValue(c);
            if (value % 2 == 1)
                sum += value;}

        for (int i = 1; sum/i > 0; i *= 10) {
            if ((sum / i) % 2 == 0)
                count++;}
        System.out.println("Сумма нечетных цифр числа " + sum);
        System.out.println("Количество четных чисел в найденной сумме " + count);
            }
    }


