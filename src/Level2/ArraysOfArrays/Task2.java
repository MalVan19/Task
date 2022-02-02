package ArraysOfArrays;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер матрицы: ");
        int m = scanner.nextInt();
        int[][] matrixA = new int[m][m];


        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Исходная матрица:");
        for (int[] a : matrixA)
            System.out.println(Arrays.toString(a));
        System.out.println("Элементы главной диагонали:");

        for (int i = 0; i < matrixA.length; i++) {

            System.out.print(matrixA[i][i] + "\t");
        }
        System.out.println();
        System.out.println("Элементы побочной диагонали: ");
        for (int i = 0; i < matrixA.length; i++) {

            System.out.print(matrixA[i][m - 1 - i] + "\t");
        }

    }
}

