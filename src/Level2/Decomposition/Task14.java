package Decomposition;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.\n" +
                "Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите k ");
        int k = input.nextInt();
        int i = 1;
        int arm;
        System.out.println("Числа Армстронга от 1 до " + k);
        while (i < k) {
            arm = numberArmstromg(i);
            if (arm == i)
                System.out.print(i + ", ");
            i++;
        }
    }

    static int numberArmstromg(int n) {
        int sum = 0;
        int temp;
        int remainder;
        int digits = 0;
        temp = n;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }
        return sum;
    }

    static int power(int n, int r) {
        int c, p = 1;
        for (c = 1; c <= r; c++)
            p = p * n;
        return p;
    }

}

