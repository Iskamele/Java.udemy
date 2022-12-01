package aegis.java.basic.section10_practicalTasks.practice;

import java.util.Arrays;

public class BubbleSortStream {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 3, 15, 52, 7, 5, 24, 35, 42, 36, 1};
        System.out.println(Arrays.toString(sort(array)));
    }

    private static int[] sort(int[] array) {
        return Arrays.stream(array)
                .sorted()
                .toArray();
    }
}
