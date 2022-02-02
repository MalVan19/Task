package OneDimensionalArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Пусть даны две неубывающие последовательности действительных чисел а1 ≤  а2 ≤  …≤ аn и  b1 ≤  b2 ≤  …≤ bn. \n" +
                "Требуется указать те места, на которые нужно вставлять элементы последовательности b1 ≤  b2 ≤  …≤bn в \n" +
                "первую последовательность так, чтобы новая последовательность оставалась возрастающе");
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
        System.out.println("массив 1 \n" + Arrays.toString(mas1));
        System.out.println("массив 2 \n" + Arrays.toString(mas2));
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] < mas2[j]) {
                    System.out.printf("%d элемент первого масс. вставим до %d элем. второго\n", i, j);
                } else System.out.printf("%d элемент первого масс. вставим после последенго элем. второго\n", i);
            }
        }
    }
}

