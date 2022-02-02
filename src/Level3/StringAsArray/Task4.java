package StringAsArray;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("В строке найти количество чисел");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите text ");
        String str = input.nextLine();
        int count = 0;
        boolean isPreviousDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (!isPreviousDigit) {
                    count++;
                    isPreviousDigit = true;
                }
            } else {
                isPreviousDigit = false;
            }
        }
        System.out.println("чисел в строке " + count);
    }
}
