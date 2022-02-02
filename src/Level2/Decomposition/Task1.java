package Decomposition;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Написать метод(методы)для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел");
        System.out.println("Введите 1 число");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Введите 2 число");
        int b = input.nextInt();
        System.out.println("НОД = " + nod(a,b));
        System.out.println("НОK = " + nok(a,b));
    }
    static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
}
