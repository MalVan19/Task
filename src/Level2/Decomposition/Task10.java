package Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Дано натуральное число N. \n" +
                "Написать метод(методы)для формирования массива, элементами которого являются цифры числа N.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число N ");
        int n = input.nextInt();
        greateMass(n);
    }
    static void  greateMass(int n){
        int temp;
        int count = 0;
        int i;
        temp = n;
        while(temp!=0)
        {
            count++;
            temp /= 10;
        }
        int[] array= new int [count];
        int j = count - 1;
        while(n!=0)
        {
            array[j--] = n %10;

            n/= 10;
        }
        System.out.println("Массив, элементами которого являются цифры числа N " + Arrays.toString(array));;
    }
}
