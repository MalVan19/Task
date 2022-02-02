package Level1.LinearPrograms;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("ведите x");
        double x = MyVar.nextDouble();
        System.out.println("ведите y");
        double y= MyVar.nextDouble();
        double z =((sin(x) + cos(y))/(cos(x) - sin(y)))*tan(x*y);
        System.out.println("Результат = " + z);
    }
}