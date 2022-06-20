package aegis.java.basic.section06_array;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayElementStatisticTwo {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (unique[i] != array[i]) {
                unique[i] = array[i];
                for (int j = 0; j < array.length; j++) {
                    if (unique[i] == array[j]) {
                        count += 1;
                    }
                }
            }
            counts[i] = count;
            System.out.println(unique[i] + " = " + ((double) counts[i] * 100 / array.length) + "%");
            count = 0;
        }
    }
}