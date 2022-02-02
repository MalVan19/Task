package OneDimensionalArrays;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.лементов.");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] mas = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент массива");
            mas[i] = input.nextInt();

        }

        for (int i = 0; i < mas.length; i++) {
            if (primeNumber(mas[i]) == 1) {
                System.out.println("Простые числа из массива: " + mas[i]);
                sum = sum + mas[i];
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(mas));
        System.out.println("Сумма простых чисел =  " + sum);
    }

    private static int primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }

            if ((i == number) || (i > Math.sqrt(number))) {
                return 1;
            }
        }
        return 0;
    }

}
