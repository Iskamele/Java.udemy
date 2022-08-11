package aegis.java.basic.section06_array.practice;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};

        var max = 0;
        var min = 0;
        var maxIndex = -1;
        var minIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println(Arrays.toString(array));
    }
}