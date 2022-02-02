package Decomposition;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Написать метод(методы)для нахождения наибольшего общего делителя четырех натуральных чисел");
        System.out.println("Введите 1 число");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Введите 2 число");
        int b = input.nextInt();
        System.out.println("Введите 3 число");
        int c = input.nextInt();
        System.out.println("Введите 4 число");
        int d = input.nextInt();
        System.out.println("НОД = " + nod(nod(a,b),nod (c,d)));

    }
     static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
}
