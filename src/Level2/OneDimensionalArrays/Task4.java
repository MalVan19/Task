package OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы.");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] mas = new int[n];
        int min = 0;
        int max = 0;
        int res;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент массива");
            mas[i] = input.nextInt();
            if (mas[min] > mas[i]) min = i;
            if (mas[max] < mas[i]) max = i;
        }
        System.out.println("Исходный массив " + Arrays.toString(mas));
        System.out.println("минимальный элемент: " + "array[" + min + "]=" + mas[min]);
        System.out.println("максимальный элемент: " + "array[" + max + "]=" + mas[max]);
        res = mas[min];
        mas[min] = mas[max];
        mas[max] = res;

        System.out.println("Измененный массив " + Arrays.toString(mas));
    }
}

