package StringAsStringBuilder;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("В строке вставить после каждого символа 'a' символ 'b'");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String text = input.nextLine();
        addSymbol(text);
    }

    static void addSymbol(String text) {
        StringBuilder textBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                textBuilder.append("ab");
            } else {
                textBuilder.append(text.charAt(i));
            }
        }
        System.out.println(textBuilder.toString());
    }
}