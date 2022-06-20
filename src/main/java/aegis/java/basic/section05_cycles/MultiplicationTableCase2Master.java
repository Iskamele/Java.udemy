package aegis.java.basic.section05_cycles;

public class MultiplicationTableCase2Master {
    public static void main(String[] args) {
// read
        var to = 9;
// display
        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= to; j++) {
                int res = i * j;
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}