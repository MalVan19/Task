package StringAsStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.\n" +
                "Например, если было введено \"abccdedef\", то должно быть выведено \"abcdef\"");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        System.out.println("Введите text ");
        System.out.println("Измененная строка " + replaceRemove(text));
    }

static String replaceRemove(String text){
StringBuilder text2 = new StringBuilder(text);

for (int i = 0; i<text2.length(); i++){
    char syb = text2.charAt(i);
    if (syb==' ') {
        text2.deleteCharAt(i);
        i--;
        continue;
    }

    for (int j = i + 1; j < text2.length(); j++) {
        if(text2.charAt(j) == syb) {
            text2.deleteCharAt(j);
        }
    }
}
        return  text2.toString();
}
}
