package aegis.java.basic.section06_array;

import java.util.Arrays;

public class ArrayCopyRangeMaster {
    public static void main(String[] args) {

        int[] source = {1, -2, 3, -4, 5};
        int startIndex = 0;
        int endIndex = 5;

        int[] destination = new int[endIndex - startIndex];

        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i + startIndex];
        }

        // System.arraycopy(source, 0 + startIndex, destination, 0, destination.length);

        System.out.println(Arrays.toString(destination));

    }
}
