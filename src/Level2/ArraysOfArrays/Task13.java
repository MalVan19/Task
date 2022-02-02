package ArraysOfArrays;

import java.util.*;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int p = scanner.nextInt();
        int[][] matrixA = new int[m][p];
        int b = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < p; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Исходная матрица:");
        for (int[] a : matrixA)
            System.out.println(Arrays.toString(a));
        {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    for (int k = 0; k < p; k++) {
                        for (int n = 0; n < matrixA[k].length; n++) {
                            if (matrixA[n][k] > matrixA[i][j]) {
                                b = matrixA[n][k];
                                matrixA[n][k] = matrixA[i][j];
                                matrixA[i][j] = b;
                            }
                        }
                    }
                }

            }

            System.out.println("\nСортировка по возрастанию: ");
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < matrixA[i].length; ++j) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }
            {
                for (int x = 0; x < m; x++) {
                    for (int j = 0; j < matrixA[x].length; j++) {
                        for (int k = 0; k < p; k++) {
                            for (int n = 0; n < matrixA[k].length; n++) {
                                if (matrixA[n][k] < matrixA[x][j]) {
                                    b = matrixA[n][k];
                                    matrixA[n][k] = matrixA[x][j];
                                    matrixA[x][j] = b;
                                }
                            }
                        }
                    }

                }

                System.out.println("\nСортировка по убыванию: ");
                for (int x = 0; x < m; ++x) {
                    for (int j = 0; j < matrixA[x].length; ++j) {
                        System.out.print(matrixA[x][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}

