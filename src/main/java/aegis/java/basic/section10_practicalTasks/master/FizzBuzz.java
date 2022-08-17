package aegis.java.basic.section10_practicalTasks.master;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);
    }

    private static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
