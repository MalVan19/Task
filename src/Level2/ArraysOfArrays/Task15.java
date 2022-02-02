package ArraysOfArrays;

import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Найдите наибольший элемент матрицы и заменить все нечетные элементы на него ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        int max = 0;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                if (a[i][j] > max)
                    max = a[i][j];

            }

        }

        System.out.println("Исходная матрица:");
        for (int[] k : a)
            System.out.println(Arrays.toString(k));
        System.out.println("Измененная матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("MAX элемент: " + max);
    }
}
