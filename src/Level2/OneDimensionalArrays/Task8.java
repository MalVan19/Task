package OneDimensionalArrays;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Дана последовательность целых чисел а1,а2, .. аn. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1,а2, .. аn).");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] array = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент последовательности");
            array[i] = input.nextInt();
        }
        System.out.println("Исходная последовательность: " + Arrays.toString(array));

        for (int x : array) {
            if (x < min) min = x;
        }
        System.out.println("min = " + min);
        int[] result = new int[array.length - 1];
        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        System.out.print("Новая последовательность: " + Arrays.toString(result));
    }
}

