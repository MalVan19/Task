package Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,\n" +
                "которое меньше максимального элемента массива, но больше всех других элементов)");
        System.out.println("Введите размерность массива ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " -й элемент массива");
            mas[i] = input.nextInt();
        }
        System.out.println("Массив из " + n + " элементов" + Arrays.toString(mas));
        SecondMax(mas);
    }

    private static void SecondMax(int[] mas) {
        int i = 0;
        int max = mas[i];
        int max1 = 0;
        for (i = 0; i < mas.length; i++) {

            if (mas[i] > max) {
                max1 = max;
                max = mas[i];
            } else if (mas[i] > max1) {
                max1 = mas[i];
            }
        }
        System.out.println("Максимальное второе число: " + max1);
    }
}