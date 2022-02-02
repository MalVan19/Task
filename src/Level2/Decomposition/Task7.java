package Decomposition;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9");
        int sum = 0;
        for (int i = 0; i < 9; i += 2) {
            sum += factorial(i + 1);
        }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9: " + sum);
    }

    static int factorial(int a) {
        int f = 1;
        for (int j = 2; j <= a; j++) f *= j;
        return f;
    }
}
