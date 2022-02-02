package ArraysOfArrays;

import java.util.*;
import java.lang.*;

public class Task4 {
    public static void main(String args[]) {
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n-четное)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = scanner.nextInt();

        System.out.println("Результат: ");

        int[][] arr = new int[n][n];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = n - j;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = j + 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

