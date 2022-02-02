package OneDimensionalArrays;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Даны действительные числа a1,a2,…an. Найти max (a1 + a2n , a2 + a2n – 1, ... , an + an+1 )");

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент массива");
            array[i] = input.nextInt();
        }
        System.out.println("array " + Arrays.toString(array));
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }

        System.out.println("max " + maxSum);
    }
}

