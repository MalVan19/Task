package StringAsStringBuilder;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Подсчитать, сколько раз среди символов заданной строки встречается буква “а”");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String text = input.nextLine();
        System.out.println("Введите символ, который небходимо найти");
        char symbol = input.next().charAt(0);
        System.out.println("Количество " + symbol+" =  "+SearchCounteSymbol(text,symbol));
    }
    static int SearchCounteSymbol(String text, char symbol)
    {
        int count=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
