package Decomposition;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.\n " +
                "Сколько таких действий надо произвести, чтобы получился нуль");
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            num = num - SummNumbers(num);
            count++;
        }
        System.out.println("Количество действий, приводящих к 0 = " + count);
    }

    static int SummNumbers(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        return sum;
    }
}
