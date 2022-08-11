package aegis.java.basic.section05_cycles.practiceMaster;

public class DisplayEvenNumbersFrom0To50Master {
    public static void main(String[] args) {
        var from = 0;
        var to = 50;
        var step = 2;

        for (var i = from; i <= to ; i+= step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
