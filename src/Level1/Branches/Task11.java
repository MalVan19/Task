import java.util.Scanner;

import static java.lang.Math.pow;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Вычислить значение функции");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("Введите x");
        double x = MyVar.nextDouble();
        if (x<=3) System.out.println("z = "+ (pow(x,2)-3*x+9));
        else System.out.println("z = "+ (1/(pow(x,3)+6)));
        }

}
