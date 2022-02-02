package Decomposition;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Даны натуральные числа К и N. Написать метод(методы)формирования массива А,\n" +
                "элементами которого являются числа, сумма цифр которых равна К и которые не большее N");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число K ");
        int k = input.nextInt();
        System.out.println("Введите число N ");
        int n = input.nextInt();
        int sum = 0;
        System.out.println("Массив, элементами которого являются цифры числа K ");
        for (int i = 0; i < k; i++) {
            sum += greateMassSumm(k);
            if (sum < n)
                System.out.print(sum + ", ");
        }
    }
    static int greateMassSumm(int k) {
        return String.valueOf(k).chars().map(i -> i - '0').sum();
    }
}
