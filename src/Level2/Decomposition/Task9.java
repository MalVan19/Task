package Decomposition;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Даны числа X, Y, Z, Т —длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y—прямой.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону X ");
        double x = input.nextDouble();
        System.out.println("Введите сторону Y ");
        double y = input.nextDouble();
        System.out.println("Введите сторону Z ");
        double z = input.nextDouble();
        System.out.println("Введите сторону T ");
        double t = input.nextDouble();
        System.out.println("Площадь четырехугольника: " + areaQuadrangle(x,y,z,t));
    }
    static double areaQuadrangle(double x, double y, double z, double t){
        double d;
        double s1;
        double s2;
        double s;
        d=Math.sqrt(x*x+y*y);//Диагональ напротив прямого угла, нашли по теореме Пифагора
        s1=x*y*0.5;//Первая часть площади четырехугольника
        s2=0.25*Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));//Вторая часть площади четырехугольника, найдено по формуле Герона
        return s=s1+s2;
    }
}
