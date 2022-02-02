package OneDimensionalArrays;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Дан целочисленный массив с количеством элементов N. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).Примечание. Дополнительный массив не использоватьшее из них");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] a = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент последовательности");
            a[i] = input.nextInt();
        }
        System.out.println("Числовая последовательность:  " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
        }
        System.out.println("Новая последовательность:  " + Arrays.toString(a));
    }
}

