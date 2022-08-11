package aegis.java.basic.section09_recursion.theory;

public class RecursionAlgorithmExampleVersion2 {
    public static void main(String[] args) {
        printNumberFromAndTo10(1);
        printNumberFrom1AndTo(100);
    }

    private static void printNumberFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumberFromAndTo10(i + 1);
        }
    }

    private static void printNumberFrom1AndTo(int i) {
        printNumberFrom1AndTo(i, i);
    }

    private static void printNumberFrom1AndTo(int i, int to) {
        if (i != 0) {
            printNumberFrom1AndTo(i - 1, to);
            System.out.print(i + "\t");
            if (i == to) {
                System.out.println();
            }
        }
    }
}