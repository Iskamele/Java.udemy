package aegis.java.basic.section05_cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {

        var to = 9;

        for (int j = 2; j <= to; j++) {
            for (int i = 2; i <= 5; i++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int j = 2; j <= to; j++) {
            for (int i = 6; i <= 9; i++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
