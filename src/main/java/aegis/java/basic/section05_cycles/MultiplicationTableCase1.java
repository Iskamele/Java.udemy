package aegis.java.basic.section05_cycles;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        System.out.print("\t"); // Таб в левом верхнем углу

        // Чтение исходных данных и выполнение вычисления
        for (int a = 1; a < 10; a++) { // Первая строка
            for (int b = 1; b < 9; b++) { // Первый столбец
                // Вывод результата
                System.out.print((a + (a * b)) + "\t");
            }
            System.out.println();
            if (a != 9) {
                System.out.print(a + 1 + "\t");
            }
        }
    }
}