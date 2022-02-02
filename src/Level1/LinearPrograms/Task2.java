import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Вычислить значение выражения по формуле (все переменные принимают действительные значения");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("ведите a");
        double a = MyVar.nextDouble();
        System.out.println("ведите b");
        double b= MyVar.nextDouble();
        System.out.println("ведите c");
        double c = MyVar.nextDouble();
        double z = (b + sqrt(pow(b,2) + 4*a*c))/2 - pow(a,3)*c + pow (b, -2);
        System.out.println("Результат = " + z);
    }
}
