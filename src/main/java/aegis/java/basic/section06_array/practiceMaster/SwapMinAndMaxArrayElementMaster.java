package aegis.java.basic.section06_array.practiceMaster;

import java.util.Arrays;

public class SwapMinAndMaxArrayElementMaster {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};

        int minIndex = 0;
        int minValue = array[0];

        int maxIndex = 0;
        int maxValue = array[0];


        for (int i = 0; i < array.length; i++) {
            var current = array[i];
            if (current < minValue) {
                minValue = current;
                minIndex = i;
            }
            if (current > maxValue) {
                maxValue = current;
                maxIndex = i;
            }
        }
        var temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        System.out.println(Arrays.toString(array));
    }
}
