package StringAsStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        System.out.println("Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком. \n"+
                "Определить количество предложений в строке X.");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите text ");
        String text = input.readLine();
        countSentence(text);
        input.close();
    }
    private static void countSentence(String text){
        int count=0;
        for (int i=0; i< text.length(); i++){
            if (text.charAt(i) == '!' || text.charAt(i) == '?' || text.charAt(i) == '.') {
                count++;
            }
        }
        System.out.println("Количество предложений в тексте " + count);
    }
}
