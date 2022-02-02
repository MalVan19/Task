package StringAsStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Из заданной строки получить новую, повторив каждый символ дважды");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        System.out.println("Введите text ");
          repeatSymbol(text);
    }

    static void repeatSymbol(String text){
        StringBuilder text2 = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                text2.append(text.charAt(i));
            }
        }
        System.out.println("Измененная строка " + text2.toString());
    }
    }

