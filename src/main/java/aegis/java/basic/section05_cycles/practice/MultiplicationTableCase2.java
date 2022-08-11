package aegis.java.basic.section05_cycles.practice;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {

        int to = 9;

        for (int a = 2; a <= to; a++) {
            for (int b = 2; b <= to; b++) {
                int res = a * b;
                System.out.println(a + " * " + b + " = " + res);
            }
            System.out.println();
        }
    }
}
