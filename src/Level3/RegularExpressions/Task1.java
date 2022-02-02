package RegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Cоздать приложение, разбирающее текст(текст хранится в строке)и позволяющее выполнять с текстом три различных операции: \n"+
                "отсортировать абзацы по количеству предложений в каждом предложении отсортировать слова по длине; \n"+
                "отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства –по алфавиту.");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите text ");
        String text = input.readLine();
sortPharag(text);

        input.close();
    }
    static void sortPharag(String text){
        String[] ArrParag = text.split("\\r?\\n");
        int [] counterSentences = new int[ArrParag.length];
        Pattern patternSentence = Pattern.compile("[A-ZА-Я][^!.?]+[!.?]");


    }


    }

