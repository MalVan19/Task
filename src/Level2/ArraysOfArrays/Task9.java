package ArraysOfArrays;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную суммуего ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];
        int[] count_sum = new int[a.length];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                count_sum[j] += a[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < count_sum.length; i++) {
            if (count_sum[i] > max) max = count_sum[i];
        }
        System.out.println("Исходная матрица:");
        for (int[] k : a)
            System.out.println(Arrays.toString(k));
        System.out.println("Сумма по столбцам:");
        System.out.println(Arrays.toString(count_sum));
        System.out.println("MAX Сумма по столбцам: " + max);
    }
}

