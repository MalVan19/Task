package OneDimensionalArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Сортировка выбором. Дана последовательность чисел .Требуется переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый -на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором");
        System.out.println("Введите размер не убывающей последовательности а");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Введите не убывающую последовательность а");
        for (int i = 0; i < n; i++) {
            mas1[i] = input.nextInt();
        }
        System.out.println("a \n" + Arrays.toString(mas1));
        for (int i = 0; i < mas1.length; i++) {
            int min = mas1[i];
            int min_i = i;
            for (int j = i + 1; j < mas1.length; j++) {
                if (mas1[j] > min) {
                    min = mas1[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = mas1[i];
                mas1[i] = mas1[min_i];
                mas1[min_i] = tmp;
            }
        }
        System.out.println("убывающая последовательность \n" + Arrays.toString(mas1));
    }
}



