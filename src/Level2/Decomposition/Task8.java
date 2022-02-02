package Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].\n" +
                "Пояснение. Составить метод(методы)для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] D = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " -й элемент массива");
            D[i] = input.nextInt();
        }
        System.out.println("Массив из " + n + " элементов" + Arrays.toString(D));
        System.out.println("Введите k ");
        int k = input.nextInt();
        if (k > D.length || k + 2 > D.length)
            System.out.println("индекс за пределами массива или последовательность элементов выходит за пределы массива");

        else
            System.out.println("Сумма трех последовательно расположенных элементов массива начиная с " + k + "-й =" + Summ(D, k));
    }

    static int Summ(int[] arr, int k) {

        int summ = 0;
        for (int i = k; i <= k + 2; i++) {
            summ += arr[i];
        }
        return summ;
    }
}