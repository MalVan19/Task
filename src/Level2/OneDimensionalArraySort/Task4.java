package OneDimensionalArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Сортировка обменами. Дана последовательность чисел а1 ≤  а2 ≤  …≤ аn .Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа a1 и ai+1 . Если  a1 > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок.");
        System.out.println("Введите размер не убывающей последовательности а");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas1 = new int[n];
        int count = 0;
        System.out.println("Введите не убывающую последовательность а");
        for (int i = 0; i < n; i++) {
            mas1[i] = input.nextInt();
        }
        System.out.println("a \n" + Arrays.toString(mas1));
        for (int i = mas1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas1[j] > mas1[j + 1]) {
                    int tmp = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = tmp;
                    count++;
                }
            }
        }
        System.out.println("Отсортированная последовательность \n" + Arrays.toString(mas1));
        System.out.println("Количество замен \n" + count);
    }
}

