package ArraysOfArrays;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Дана матрица. Вывести k-ю строку и p-й столбец матрицы ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        int[][] matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Введите номер строки: ");
        int k = scanner.nextInt();
        System.out.println("Введите номер столбца: ");
        int p = scanner.nextInt();
        System.out.println("Исходная матрица:");
        for (int[] a : matrixA)
            System.out.println(Arrays.toString(a));

        System.out.println("Столбец по условию:");
        for (int i = 0; i < m; i++) {
            System.out.println("\t" + matrixA[i][p - 1]);

        }
        System.out.println("Строка по условию:");
        for (int j = 0; j < n; j++) {
            System.out.print(matrixA[k - 1][j] + "\t");
        }

        System.out.println();

    }
}
