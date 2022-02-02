import java.util.Scanner;

public class Task13 {
        public static void main (String [] args){
            System.out.println("Вычислить значения функции на отрезке [а,b] c шагом h:");
            Scanner MyVar = new Scanner(System.in);
            System.out.println("ведите начало отрезка a");
            float a = MyVar.nextFloat();
            System.out.println("ведите конец отрезка b");
            float b = MyVar.nextFloat();
            System.out.println("ведите шаг h");
            float h = MyVar.nextFloat();
            int sum = 0;
            for (float x = a; x <= b; x+=h) {
                if (x > 2) sum+=x; else sum+=(-x);
            }
            System.out.println("Значение функции y= " + sum);
        }


}
