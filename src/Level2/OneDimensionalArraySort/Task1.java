package OneDimensionalArraySort;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив, включив второй массив между k-м и (k+1) -м элементами первого, при этом не используя дополнительный массив:");
        System.out.println("Введите размерность 1 массива");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Введите элементы 1 массива");
        for (int i = 0; i < n; i++) {
            mas1[i] = input.nextInt();
        }
        System.out.println("Введите размерность 2 массива");
        int m = input.nextInt();
        int[] mas2 = new int[m];
        System.out.println("Введите элементы 2 массива");
        for (int i = 0; i < m; i++) {
            mas2[i] = input.nextInt();
        }
        System.out.println("Введите k");
        int k = input.nextInt();
        if (k>n) System.out.println("Индекс выходит за пределы массива");
        int[] res = new int[mas1.length + mas2.length];
        int p = 0;
        for (int j = 0; j < k; j++) res[p++] = mas1[j];
        for (int j = 0; j < mas2.length; j++) res[p++] = mas2[j];
        for (int j = k; j < mas1.length; j++) res[p++] = mas1[j];
        System.out.println("массив 1 \n" + Arrays.toString(mas1));
        System.out.println("массив 2 \n" + Arrays.toString(mas2));
        System.out.println("result \n" + Arrays.toString(res));
    }
}
