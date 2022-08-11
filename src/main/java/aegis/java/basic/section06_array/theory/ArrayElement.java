package aegis.java.basic.section06_array.theory;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        System.out.println(array[0]);

        array[0] = 45;
        System.out.println(Arrays.toString(array));
    }
}
