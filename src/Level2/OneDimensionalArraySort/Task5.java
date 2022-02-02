package OneDimensionalArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Сортировка вставками. Дана последовательность чисел a1, a2 .. an \n" +
                "Требуется переставить числа в порядке возрастания. Делается это следующим образом. \n" +
                "Пусть a1, a2 .. an -упорядоченная последовательность, т. е. а1 ≤  а2 ≤  …≤ аn.\n" +
                "Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.");
        System.out.println("Введите размер не убывающей последовательности а");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Введите последовательность а");
        for (int i = 0; i < n; i++) {
            mas1[i] = input.nextInt();
        }
        System.out.println("a \n" + Arrays.toString(mas1));
        int tp;
        int k;
        for (int i = 1; i < mas1.length; i++) {
            k = bSearch(mas1, 0, mas1.length - 1, mas1[i]);
            for (int j = i; j > k; j--) {
                tp = mas1[j - 1];
                mas1[j - 1] = mas1[j];
                mas1[j] = tp;
            }
        }
        System.out.println("Отсортированная последовательность \n" + Arrays.toString(mas1));
    }

    public static int bSearch(int[] arr, int l, int r, int x) {
        int m = -1;
        if (x < arr[l])
            return l;
        if (x > arr[r])
            return r;
        while (l <= r) {
            m = (int) ((l + r) / 2);
            if (x >= arr[m] && x < arr[m + 1])
                return m + 1;
            if (x < arr[m])
                r = m - 1;
            if (x > arr[m])
                l = m + 1;
        }
        return m;
    }


}

