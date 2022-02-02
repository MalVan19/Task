package StringAsStringBuilder;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт");
        String str = "информатика";
        System.out.println("Результат " + str.charAt(7)+str.substring(3,5)+ str.charAt(7) );
    }
}
