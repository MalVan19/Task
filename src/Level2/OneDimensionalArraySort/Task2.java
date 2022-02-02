package OneDimensionalArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Даны две последовательности а1 ≤  а2 ≤  …≤ аn и  b1 ≤  b2 ≤  …≤bn. Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.");
        System.out.println("Введите размер не убывающей последовательности а");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Введите не убывающую последовательность а");
        for (int i = 0; i < n; i++) {
            mas1[i] = input.nextInt();
        }
        System.out.println("Введите размер не убывающей последовательности b");
        int m = input.nextInt();
        int[] mas2 = new int[m];
        System.out.println("Введите не убывающую последовательность b");
        for (int i = 0; i < m; i++) {
            mas2[i] = input.nextInt();
        }
        int[] res = new int[mas1.length + mas2.length];
        int p = 0;
        for (int j = 0; j < mas1.length; j++) res[p++] = mas1[j];
        for (int j = 0; j < mas2.length; j++) res[p++] = mas2[j];
//Arrays.sort(res);
        for (int i = 0; i < res.length - 1; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (res[i] > res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        System.out.println("a \n" + Arrays.toString(mas1));
        System.out.println("b \n" + Arrays.toString(mas2));
        System.out.println("result \n" + Arrays.toString(res));
    }
}
