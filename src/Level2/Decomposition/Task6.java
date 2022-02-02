package Decomposition;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.");
        System.out.println("Введите 1 число ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Введите 2 число ");
        int b = input.nextInt();
        System.out.println("Введите 3 число ");
        int c = input.nextInt();
        if (checkPrimeNumbers(checkPrimeNumbers(a, b), c) == 1)
            System.out.println("Числа взаимно простые");
        else
            System.out.println("Числа не взаимно простые");
    }

    static int checkPrimeNumbers(int a, int b) {
        while (a != 0 && b != 0) {
            if (a >= b) a = a % b;
            else b = b % a;
        }
        return a + b;
    }

}
