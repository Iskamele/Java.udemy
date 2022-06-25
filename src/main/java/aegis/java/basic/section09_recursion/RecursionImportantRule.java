package aegis.java.basic.section09_recursion;

public class RecursionImportantRule {
    public static void main(String[] args) {
        function1(10);
    }

    private static void function1(int count) {
        if (count > 0) {
            function1(count - 1);
        }
    }
}
