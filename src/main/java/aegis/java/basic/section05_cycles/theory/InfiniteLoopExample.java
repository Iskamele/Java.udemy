package aegis.java.basic.section05_cycles.theory;

import java.util.Scanner;

public class InfiniteLoopExample {
    public static void main(String[] args) {
        while (true) {
            var num = new Scanner(System.in).nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num * num);
        }
        System.out.println("Bye");
    }
}
