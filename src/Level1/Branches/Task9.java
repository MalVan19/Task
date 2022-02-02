import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). " +
                "Определить, будут ли они расположены на одной прямой.");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("Введите x1");
        double x1 = MyVar.nextDouble();
        System.out.println("Введите y1");
        double y1 = MyVar.nextDouble();
        System.out.println("Введите x2");
        double x2 = MyVar.nextDouble();
        System.out.println("Введите y2");
        double y2 = MyVar.nextDouble();
        System.out.println("Введите x3");
        double x3 = MyVar.nextDouble();
        System.out.println("Введите y3");
        double y3 = MyVar.nextDouble();
        if ((x3-x1)*(y2-y1)==(x2-x1)*(y3-y1)) System.out.println("Точки расположены на одной прямой");
        else System.out.println("Точки не расположены на одной прямой");
        }
        //((x1-x2)/(x2-x3))==((y3-y1)/(y2-y1))
}
