package OneDimensionalArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. \n" +
                "Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. \n" +
                "Если ai  > ai+1, то продвигаются на один элемент вперед. Если ai < ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки");
        System.out.println("Введите размер не убывающей последовательности а");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Введите последовательность а");
        for (int i = 0; i < n; i++) {
            mas1[i] = input.nextInt();
        }
        System.out.println("a \n" + Arrays.toString(mas1));
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > mas1[i + 1]) {
                int temp = mas1[i];
                mas1[i] = mas1[i + 1];
                mas1[i + 1] = temp;
            } else if (mas1[i] < mas1[i + 1]) {
                int temp = mas1[i];
                mas1[i] = mas1[i - 1];
                mas1[i - 1] = temp;
            }
        }
        System.out.println("Отсортированная последовательность \n" + Arrays.toString(mas1));
    }
}



