import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа. ");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("ведите действительное число вида nnn,ddd");
        double x = MyVar.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println("Результат = " + y);
    }
}
