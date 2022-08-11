package aegis.java.basic.section09_recursion.theory;

public class SumFrom1To100UsingRecursion {
    public static void main(String[] args) {
        System.out.println(sumOf(1, 0));
        System.out.println(sumOf(100));
    }

    private static int sumOf(int current, int sum) {
        if (current > 100) {
            return sum;
        } else {
            return sumOf(current + 1, sum + current);
        }
    }

    private static int sumOf(int value) {
        if (value == 0) {
            return 0;
        } else {
            return value + sumOf(value - 1);
        }
    }
}
