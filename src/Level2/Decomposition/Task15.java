package Decomposition;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).\n" +
                "Для решения задачи использовать декомпозицию");
        System.out.println("Введите число");

        for (Scanner scanner = new Scanner(System.in); scanner.hasNextLine(); ) {
            AscendingSearch(scanner.nextLine());
            System.out.println("Введите число ");
//      if (scanner.nextLine().equals("S")) break;
        }
    }

    static void AscendingSearch(String num) {
        for (int i = 0; i < num.length(); ++i) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                System.out.println("Ведено не число: " + num);
                return;
            } else if (i > 0 && num.charAt(i) <= num.charAt(i - 1)) {
                System.out.println("Цыфры НЕ образуют возрастающюю последовательность: " + num);
                return;
            }
        }
        System.out.println("Цыфры образуют возрастающюю последовательность: " + num);
    }


}
