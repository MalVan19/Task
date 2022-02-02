package OneDimensionalArrays;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К ");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число К");
        int K = input.nextInt();
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] mas = new int[n];
        int[] newMas = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент массива");
            mas[i] = input.nextInt();
            if (mas[i] % K == 0) {
                sum = sum + mas[i];
                newMas[i] = mas[i];
            }
        }
        System.out.println("числа " + " кратные : " + K + " " + Arrays.toString(newMas));
        System.out.println("Сумма чисел кратных " + K + " равно  " + sum);
    }
}
