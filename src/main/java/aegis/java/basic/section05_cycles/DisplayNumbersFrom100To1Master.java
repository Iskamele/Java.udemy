package aegis.java.basic.section05_cycles;

public class DisplayNumbersFrom100To1Master {
    public static void main(String[] args) {
        // read source data
        var from = 100;
        var to = 1;
        var step = 1;

        // display results
        for (int i = from; i >= to; i -= step) {
            System.out.print(i + " ");
        }
    }
}