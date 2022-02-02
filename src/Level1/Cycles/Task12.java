import java.util.Scanner;

public class Task12 {
        public static void main (String [] args){
            System.out.println("Напишите программу, где пользователь вводит любое целое положительное число. " +
                    "А программа суммирует все числа от 1 до введенного пользователем числа.");
            Scanner MyVar = new Scanner(System.in);
            System.out.println("ведите n");
            int n = MyVar.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum+=i;
            }
            System.out.println("Сумма чисел = " + sum);
        }


}
