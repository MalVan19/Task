package ArraysOfArrays;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Найти положительные элементы главной диагонали квадратной матрицы");

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
        System.out.println("Положительные элементы главной диагонали:");

        for (int i = 0; i < m; i++) {
            if (matrixA[i][i] > 0) {
                System.out.print(matrixA[i][i] + "\t");
            }
        }
        System.out.println();
    }
}
