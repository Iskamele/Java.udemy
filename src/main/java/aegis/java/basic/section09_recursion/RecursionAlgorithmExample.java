package aegis.java.basic.section09_recursion;

public class RecursionAlgorithmExample {
    public static void main(String[] args) {
        printNumersFrom1To10();
        printNumersFromAndTo10(1);
    }

    /*private static void printNumersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }*/

    // Итеративный алгоритм
    private static void printNumersFrom1To10() {
        int i = 1;
        while (true) {
            if (i > 10) {
                System.out.println();
                break;
            }
            System.out.print(i + "\t");
            i++;
        }
    }

    // Рекурсивный алгоритм
    private static void printNumersFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumersFromAndTo10(i + 1);
        }
    }
}
