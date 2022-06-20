package aegis.java.basic.section06_array;

import java.util.Arrays;

public class ArrayReverseMaster {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 8, 16, 24, 48, 96, 5};

        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
