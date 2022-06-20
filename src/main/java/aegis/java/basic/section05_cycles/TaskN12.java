package aegis.java.basic.section05_cycles;

public class TaskN12 {
    public static void main(String[] args) {
        // read source data
        {
        var from = 100;
        var to = 1;
        var step = 1;

        // display results
        /*
        for (int i = from; i >= to; i -= step) {
            System.out.print(i + " ");
        }
        */
        int i = from;
        while (i >= to) {
            System.out.print(i + " ");
            i -= step;
        }
            System.out.println();
    }

        {
            var from = 0;
            var to = 50;
            var step = 2;

            var i = from;
            while (i <= to) {
                System.out.print(i + " ");
                i += step;
            }
        }
    }
}