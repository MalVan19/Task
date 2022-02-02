package StringAsStringBuilder;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String text = input.nextLine();
        System.out.println("Максимальное количество пробелов в строке = "+SearchMoreSpaces(text));
    }
    static int SearchMoreSpaces(String text)
    {
        int countSpace=0;
        int maxCount=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                countSpace++;
            } else {
                if (maxCount < countSpace) {
                    maxCount = countSpace;
                }
                countSpace = 0;
            }
        }
        return maxCount;
    }
}
