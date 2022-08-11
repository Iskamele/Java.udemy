package aegis.java.basic.section05_cycles.practice;

public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        // чтение исходных данных
        int from = 1;
        int to = 100;
        int cols = 10;

        // вывод результатов
        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t");
            if (i % cols == 0) {
                System.out.println();
            }
        }
    }
}
