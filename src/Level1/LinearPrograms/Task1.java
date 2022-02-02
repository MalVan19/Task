import java.util.Scanner;
public class Task1 {
        public static void main (String [] args){
            System.out.println("Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.");
            Scanner MyVar = new Scanner(System.in);
            System.out.println("ведите a");
            float a = MyVar.nextFloat();
            System.out.println("ведите b");
            float b = MyVar.nextFloat();
            System.out.println("ведите c");
            float c = MyVar.nextFloat();
            System.out.println("z = " + (((a - 3)*b/2) +c));
        }


}
