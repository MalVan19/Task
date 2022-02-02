package OneDimensionalArrays;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int count = 0;
        int[] b = new int[a.length];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент последовательности");
            a[i] = input.nextInt();
        }
        System.out.println("Числовая последовательность:  " + Arrays.toString(a));

        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) {
                    count++;
                }
            }
            b[j] = a[j];
            if (count == 1)
                System.out.println("Дубликаты " + a[j]);
            count = 0;
        }
        for (int x : b) {
            if (x < min) min = x;
        }

        System.out.println("min = " + min);

    }
}

