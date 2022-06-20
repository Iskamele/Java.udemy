package aegis.java.basic.section05_cycles;

public class TaskN15 {
    public static void main(String[] args) {
        // DisplayNumbersFrom100To1
        {
            // read source data

            var from = 100;
            var to = 1;
            var step = 1;

            // display results

            int i = from;
            do {
                System.out.print(i + " ");
                i -= step;
            } while (i >= to);
            System.out.println();
        }
// DisplayEvenNumbersFrom0To50
        {
            // read source data

            var from = 0;
            var to = 50;
            var step = 2;

            // display results

            var i = from;
            do {
                System.out.print(i + " ");
                i += step;
            } while (i <= to);
        }
    }
}