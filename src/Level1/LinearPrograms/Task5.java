import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Дано натуральное число Т, которое представляет длительность\n" +
                "прошедшего времени в секундах. Вывести данное значение длительности в\n" +
                "часах, минутах и секундах в следующей форме: НН час ММ мин SS cек\n");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("ведите время в секундах T");
        int t = MyVar.nextInt();
        int h = t/3600;
        int min = t/60%60;
        int sec = t%60;
        System.out.println("В "+ t+ " секундах: " + h +" ч " + min + " мин " + sec + " с ");
    }
}
