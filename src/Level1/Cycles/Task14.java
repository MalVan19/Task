public class Task14 {
    public static void main(String[] args) {
        System.out.println("Найти сумму квадратов первых ста чисел");
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            sum = sum + (n * n);
            n++;
        }
        System.out.println("Сумма квадратов первых 100 чисел равно: " + sum);
    }


}
