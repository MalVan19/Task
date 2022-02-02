package ArraysOfArrays;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
                if (i < arr[i].length && i <= j) {
                    for (int h = i; h >= 0; h--) {
                        arr[h][j] = 1;
                    }
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

