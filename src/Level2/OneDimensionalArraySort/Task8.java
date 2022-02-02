package OneDimensionalArraySort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Даны дроби p1/q1, p2/q2, … pn/qn  (qi,pi,-натуральные). \n " +
                        "Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = input.nextInt();
        List<Fraction> fs = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Введите числитель "+ (i+1) + " элемента");
            int numerator = input.nextInt();
            System.out.println("Введите знаменатель "+ (i+1) + " элемента");
            int denominator = input.nextInt();
            fs.add(new Fraction(numerator, denominator));

            }
        System.out.println("Изначальная последовательность \n" + fs);
        System.out.println("Отсортированная последовательность \n");
        long lcd = fs.stream()
                .mapToLong(f -> f.d)
                .reduce(1, (d1, d2) -> d1 * d2 / nod(d1, d2));
        fs.stream()
                .map(f -> f.setNok(lcd))
                .sorted(Fraction::sort)
                .forEach(System.out::println);
    }
    static long nod(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    static class Fraction {
        long n, d; // numerator, denominator

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }
        public Fraction setNok(long lcd) {
            n *= (lcd / d);
            d = lcd;
            return this;
        }
        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }
    }
}
