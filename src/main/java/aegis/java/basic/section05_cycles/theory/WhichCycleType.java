package aegis.java.basic.section05_cycles.theory;

import java.util.Iterator;
import java.util.List;

public class WhichCycleType {
    public static void main(String[] args) {

        //for

        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while
        int j = 0;
        while (j < 4) {
            System.out.print(j++ + " ");
        }
        System.out.println();


        // do while
        int k = 0;
        do {
            System.out.print(k++ + " ");
        } while (k < 4);
        System.out.println();


        // Which?
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = List.of(1, 2, 3, 4).iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }
}
