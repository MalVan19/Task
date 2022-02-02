import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. " +
                "Определить, пройдет ли кирпич через отверстие.");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("Введите сторону А");
        int a = MyVar.nextInt();
        System.out.println("Введите сторону B");
        int b = MyVar.nextInt();
        System.out.println("Введите параметр кирпича x");
        int x = MyVar.nextInt();
        System.out.println("Введите параметр кирпича y");
        int y = MyVar.nextInt();
        System.out.println("Введите параметр кирпича z");
        int z = MyVar.nextInt();
        if (((a>=x) && (b>=y)) ||((a>=y) && (b>=x))|| ((a>=x) && (b>=z))||((a>=z) && (b>=x)) || (((a>=z)&& (b>=y))||((a>=y) && (b>=z)))) System.out.println("Кирпич пройдет");
        else System.out.println("Кирпич не пройдет");
        }

}
