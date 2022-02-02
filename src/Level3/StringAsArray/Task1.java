package StringAsArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Дан массив названий переменных в camelCase. Преобразовать названия в snake_case");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива ");
        int n = input.nextInt();
        String[] array = new String[n];
        System.out.println("Введите строку в camelCase");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.next();
        }
        System.out.println("Исходный массив строк: " + Arrays.toString(array));
        CamalCasetoSnakeCase(array);
    }

    static void CamalCasetoSnakeCase(String[] array) {
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < array.length; i++) {
            Matcher m = p.matcher(array[i]);
            StringBuffer strb = new StringBuffer();
            while (m.find()) {
                m.appendReplacement(strb, "_$0");
            }
            m.appendTail(strb);
            array[i] = strb.toString().toLowerCase();
        }
        System.out.println("Преобразованный массив " + Arrays.toString(array));
    }

}
