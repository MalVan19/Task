package StringAsStringBuilder;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Проверить, является ли заданное слово палиндромом");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String text = input.nextLine();
        if (!isPalindrome(text)) System.out.println("не палиндром");
        else System.out.println("палиндром");
    }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}