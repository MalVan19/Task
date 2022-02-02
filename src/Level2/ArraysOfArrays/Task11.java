package ArraysOfArrays;

import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз");
        int[][] arr = new int[10][20];
        Random rnd = new Random();
        int curr = 0;
        String s = "Больше трех раз 5 повторяется в строках: ";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(15) + 1;
                if (arr[i][j] == 5) {
                    curr++;
                }
            }
            if (curr >= 3) {
                s = s + i + ", ";
            }
        }
        System.out.println("Исходная матрица:");
        for (int[] a : arr)
            System.out.println(Arrays.toString(a));
        System.out.println("______________________________");
        System.out.println(s);
    }
}
