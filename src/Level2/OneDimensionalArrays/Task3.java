package OneDimensionalArrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        int[] mas = new int[n];
        int p_sum = 0;
        int o_sum = 0;
        int null_sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент массива");
            mas[i] = input.nextInt();
            if (mas[i] > 0) {
                p_sum = p_sum + mas[i];

            } else if (mas[i] < 0) {
                o_sum = o_sum + mas[i];

            } else if (mas[i] == 0) {
                null_sum = null_sum + mas[i];

            }
        }

        System.out.println("Сумма положительных чисел =  " + p_sum);
        System.out.println(" Сумма отрицательных чисел = " + o_sum);
        System.out.println(" Сумма нулевых элементов = " + null_sum);
    }
}

