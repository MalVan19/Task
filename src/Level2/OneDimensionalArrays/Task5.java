package OneDimensionalArrays;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi> i ");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность последовательности ");
        int n = input.nextInt();
        int[] mas = new int[n];
        int[] newMas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите последовательность");
            mas[i] = input.nextInt();
            if (mas[i] > i) {
                newMas[i] = mas[i];
            }
        }
        System.out.println("числа ,которые больше[i] : " + Arrays.toString(newMas));
    }
}


