import java.math.BigInteger;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Составить программу нахождения произведения квадратов первых двухсот чисел.");
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }

        System.out.println("Произведение квадратов первых 200 чисел равно: " + s);
    }
}
