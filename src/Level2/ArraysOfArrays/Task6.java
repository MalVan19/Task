package ArraysOfArrays;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n-четное)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = scanner.nextInt();
        System.out.println("Результат: ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = 1;
                arr[n - i - 1][j] = 1;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

