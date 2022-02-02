package StringAsArray;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Замените в строке все вхождения 'word' на 'letter'.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String str = input.nextLine();
        System.out.println(str.replace("word", "letter"));
    }
}
