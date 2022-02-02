package ArraysOfArrays;

import java.util.*;

import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Сформировать квадратную матрицу порядка N по правилу. Подсчитать количество положительных элементов в ней)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = scanner.nextInt();
        int p_sum = 0;
        System.out.println("Результат: ");
        double[][] arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (sin((pow(i, 2) - pow(j, 2)) / n));
                if (arr[i][j] > 0) {
                    p_sum++;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Количество положительных элементов: " + p_sum);
    }
}

