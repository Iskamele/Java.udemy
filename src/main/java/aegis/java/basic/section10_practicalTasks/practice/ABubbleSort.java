package aegis.java.basic.section10_practicalTasks.practice;

import java.util.Arrays;

public class ABubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 3, 15, 52, 7, 5, 24, 35, 42, 36, 1};
        System.out.println(Arrays.toString(sort(array)));
    }

    private static int[] sort(int[] array) {
        int[] arrayCheck = array.clone();
        boolean exit = false;
        cycleSort(array);
        while (!exit) {
            if (Arrays.equals(arrayCheck, array)) {
                exit = true;
            }
            arrayCheck = array.clone();
            cycleSort(array);
        }
        return array;
    }
    private static void cycleSort (int[] array){
        int buffer;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                buffer = array[i];
                array[i] = array[i - 1];
                array[i - 1] = buffer;
            }
        }
    }
}
