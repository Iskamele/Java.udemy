package aegis.java.basic.section10_practicalTasks.master;

import java.util.Arrays;

public class ABubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 3, 15, 52, 7, 5, 24, 35, 42, 36, 1};
        bubleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j - 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
