package aegis.java.basic.section05_cycles.practiceMaster;

public class SumFrom1To100Master {
    public static void main(String[] args) {
        //read
        var from = 1;
        var to = 100;

        // processing
        var sum = 0;

        for (int i = from; i <= to; i++) {
            sum += i; //sum = sum + i;
        }
        // display
        System.out.println(sum);
    }
}
