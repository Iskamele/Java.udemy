package aegis.java.basic.section09_recursion.theory;

public class FactorialUsingRecursionVersion2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(5));
    }

    private static int factorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }

    // Функция-обвёртка для входа в нашу рекурсию
    private static int factorial2(int value) {
        return factorial(1, value, 1);
    }

    private static int factorial(int from, int to, int result) {
        if (from > to) {
            return result;
        } else {
            return factorial(from + 1, to, result * from);
        }
    }
}