import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Для данной области составить линейную программу, которая печатает true, " +
                "если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("координаты х");
        double x = MyVar.nextDouble();
        System.out.println("координаты y");
        double y = MyVar.nextDouble();
        if ((((y >= -3) &&(x <= -4))) || (((y >= -3) && (x <= 5)) ) || (((x <= 2) && (y <= 4)) ) ||((x >= -2) && (y <= 4)))
        //if (((-3 >= y && y<=0) && (-4 <= x && x<= 4)) || ((0 > y && y<=3) && (-2 <= x && x<= 2)))
        System.out.println("true");
        else System.out.println("false");
    }
}
