package Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).\n" +
                "Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n-заданное натуральное число больше 2. Для решения задачи использовать декомпозицию");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите начало отрезка N ");
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList();
        if (n < 2) System.out.println("число должно быть больше 2");
        else {
            for (int i = n; i <= 2 * n; i++)
                list.add(i);
        }
        System.out.println("Отрезок" + list);
        Integer[] mas1 = list.toArray(new Integer[list.size()]);
        findTwins(mas1, n);
    }

    public static void findTwins(Integer[] mas1, int N) {
        int count = 0;
        int res = 0;
        int res1= 0;
        System.out.print("Близнецы: ");
        for (int i = N; i <= mas1.length; i++) {
            if (!IsSimpleNumber(N)) {
                if (!IsSimpleNumber(N + 2)) {
                   // System.out.println(N + ", " + (N + 2) + "; ");
                  res =   N;
                  res1= N+2;
                    count++;
                }
            }
        }
        System.out.println(res + ", " + res1 + "; ");
        System.out.println("Количество близнецов " + count);

    }

    static boolean IsSimpleNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return true;
            }
        }
        return false;
    }

}