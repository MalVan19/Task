package StringAsStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args)throws IOException {
        System.out.println("Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. \n"
                +"Учитывать только английские буквы.");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите text ");
        String text = input.readLine();
        countSymbol(text);
        input.close();
    }
    static void countSymbol(String text){
        int countUpp = 0;
        int countLow = 0;
        for (int i = 0; i<text.length();i++)
        {
            char splString = text.charAt(i);
        if (splString>='a'&&splString<='z')
            countUpp++;
        else if (splString>='A'&&splString<='Z')
            countLow++;
        }
        System.out.println("Количество прописных букв(больших) = "+countUpp);
        System.out.println("Количество строчных (маленьких) букв = "+countLow);
    }
}
