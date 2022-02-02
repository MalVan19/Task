package StringAsStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args)throws IOException {
        System.out.println("Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.\n" +
                "Случай, когда самых длинных слов может быть несколько, не обрабатывать.");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        System.out.println("Введите text ");
        System.out.println("Самое длинное слово "+getLongestWord(text));
    }
    static String getLongestWord(String text){
        String words[] = text.split(" ");
        int len = 0;
        String longest = "";

        for (String string : words) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;
    }
}
