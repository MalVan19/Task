package StringAsArray;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("В строке найти количество цифр");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String str = input.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) count++;
        }
        System.out.println("цифр в строке " + count);
    }
}
