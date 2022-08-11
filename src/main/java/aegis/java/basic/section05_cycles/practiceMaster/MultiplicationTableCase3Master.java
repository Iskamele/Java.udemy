package aegis.java.basic.section05_cycles.practiceMaster;

public class MultiplicationTableCase3Master {
    public static void main(String[] args) {
        // read
        var to = 9;
        var cols = 4;
        // display
        for (int r = 2; r <= to; r += cols) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + cols; j++) {
                    System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}