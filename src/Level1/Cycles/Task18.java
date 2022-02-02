import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        System.out.println("Для каждого натурального числа"+
                "	в промежутке от m до n вывести все делители, кроме единицы и самого числа.m и n вводятся с клавиатуры ");
        Scanner MyVar = new Scanner(System.in);
        System.out.println("ведите начало m");
        int m = MyVar.nextInt();
        int d = 0;
        System.out.println("ведите конец n");
        int n = MyVar.nextInt();
        while (m<n){
            for (int i = 2; i < m-1; i++)
            {
                if (m%i==0 ) {

                    System.out.println ("Делители "+ i );
                    d=i;
                }
            }
            m++;

        }
        System.out.println ("Всего " + d);

    }
}

