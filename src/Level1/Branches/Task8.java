import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Найти max{min(a, b), min(c, d)}.");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("Введите a");
        double a = MyVar.nextDouble();
        System.out.println("Введите b");
        double b = MyVar.nextDouble();
        System.out.println("Введите c");
        double c = MyVar.nextDouble();
        System.out.println("Введите d");
        double d = MyVar.nextDouble();
        System.out.println(Math.max(Math.min(a,b), Math.min(c,d)));
    }
}
