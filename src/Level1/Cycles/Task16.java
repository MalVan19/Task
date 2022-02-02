import static java.lang.Math.abs;
import static java.lang.Math.pow;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Даны числовой ряд и некоторое число е. " +
                "Найти сумму тех членов ряда, модуль которых больше или равен заданному е. " +
                "Общий член ряда имеет вид:");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("число е");
        double e = MyVar.nextDouble();
        double s = 0;
        double n = 1;

        for (int i = 0; i < n; i++) {
            double a = (1 / (pow(2, i))) + (1 / (pow(3, i)));
            if (abs(a) >= e) {
                s += a;
                n++;
            }
        }
        System.out.println("Результат = " + s);
    }
}