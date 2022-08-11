package aegis.java.basic.section06_array.practice;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 8, 16, 24, 48, 96};
        int[] array2 = new int[array.length];

        int index;
        for (int i = array.length - 1; i >= 0; i--) {
            index = array[i];
            array2[array.length-1-i] = index;
        }
        System.arraycopy(array2, 0, array, 0, array2.length);
        

        System.out.println(Arrays.toString(array));
    }
}
