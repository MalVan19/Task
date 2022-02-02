package OneDimensionalArrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Дана последовательность действительных чисел а1,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен ");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число Z");
        int Z = input.nextInt();
        System.out.println("Введите размерность последовательности ");
        int n = input.nextInt();
        int[] mas = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите последовательность");
            mas[i] = input.nextInt();
            if (mas[i] > Z) {
                mas[i] = Z;
                sum++;
            }
        }
        System.out.println("Сумма замены на " + Z + " равно  " + sum);
    }
}
