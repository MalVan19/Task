package StringAsArray;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. \n" +
                "Крайние пробелы в строке удалить.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String str = input.nextLine();
        System.out.println(str.replaceAll("\s+"," ").trim());
    }

}
