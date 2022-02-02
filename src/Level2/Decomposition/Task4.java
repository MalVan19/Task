package Decomposition;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек ");
        int m = scanner.nextInt();
        //double[][] mas = new double[m][2];
        double[] x = new double[m];
        double[] y = new double[m];
        double[][] koord = {x, y};
        for (int i = 0; i < m; i++) {
            System.out.println("Введите координаты х " + (i + 1) + "-й точки");

            x[i] = scanner.nextDouble();
        }
        for (int j = 0; j < x.length; j++) {
            System.out.println("Введите координаты у " + (j + 1) + "-й точки");
            y[j] = scanner.nextDouble();
        }
        //System.out.println("Координаты точек" + Arrays.deepToString(koord));
        maxDistance(x, y, m);
    }

    static double maxDistance(double[] x, double[] y, int n) {
        double d = 0;
        double max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d = Math.sqrt((Math.pow(2, x[j] - x[i])) + (Math.pow(2, y[j] - y[i])));
                if (max < d)
                    max = d;
            }
            System.out.println("Расстояние между точками "+ (i+1)+ "-й парой = "+ d);
        }
        System.out.println("Макимальное расстояние между точками " +max);
        return max;
    }
}
