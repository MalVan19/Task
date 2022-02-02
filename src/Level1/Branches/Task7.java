import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Даны два угла треугольника (в градусах). " +
                "Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("Введите первый угол (в градусах)");
        double x = MyVar.nextDouble();
        System.out.println("Введите второй угол (в градусах)");
        double y = MyVar.nextDouble();
        double sum = x +y;
        if (sum>180) System.out.println("Треугольник не существует");
        else System.out.println("Треугольник существуе");
        if ((sum == 90) || (x==90) || (y==90)) System.out.println("Треугольник прямоугольный");
        else System.out.println("Треугольник не прямоугольный");
    }
}
