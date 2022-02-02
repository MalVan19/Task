package ArraysOfArrays;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        int ch;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Поменять столбцы: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Исходная матрица:");
        for (int[] k : a)
            System.out.println(Arrays.toString(k));

        System.out.println("по условию:");
        for (int i = 0; i < n; i++) {
            ch = a[i][n1 - 1];
            a[i][n1 - 1] = a[i][n2 - 1];
            a[i][n2 - 1] = ch;
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
