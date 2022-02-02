package Decomposition;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Вычислить площадь правильного шестиугольника со стороной а, используя метод  вычисления площади треугольника");
        System.out.println("Введите сторону a");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Площадь треугольника = " + s(a));
        System.out.println("Площадь шестиугольника = " + 6*s(a));
    }
       static double s(double a) {
        return ((a*a)*Math.sqrt(3))/4;
    }
}
