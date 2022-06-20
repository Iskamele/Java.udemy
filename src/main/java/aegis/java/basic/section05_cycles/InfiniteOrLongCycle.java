package aegis.java.basic.section05_cycles;

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        long time = System.nanoTime(); // Сохраняем время перед вычислением кода

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.currentTimeMillis(); // Запрашиваем текущее время

            if (i % 100_000_000 == 0) { // Проверка цикла, бесконечный он или произошла ошибка
                System.out.println(i);
            }
        }
        long result = System.nanoTime() - time; // Запрашиваем время после вычисления и вычитаем время, которое сохранили раннее. И получаем результат в наносекундах
        System.out.println((double) result / 1_000_000_000 + " seconds"); // Для того, чтобы результат в наносекундах преобразовать в секунды, результат делим на 1.000.000.000
    }
}
