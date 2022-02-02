package Decomposition;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1-e число ");
        int a = input.nextInt();
        System.out.println("Введите 2-e число ");
        int b = input.nextInt();
        maxCountNumber(a,b);
    }
    static void maxCountNumber(int a, int b){
      String str = String.valueOf(a);
        String str2 = String.valueOf(b);
        if (str.length()==str2.length())
            System.out.println("Числа одинаковые");
        else if (str.length()<str2.length())
            System.out.println("Второе число длиннее");
        else if (str.length()>str2.length())
        System.out.println("Первое число длиннее");
    }
}
