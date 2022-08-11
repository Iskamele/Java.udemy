package aegis.java.basic.section06_array.practiceMaster;

import java.util.Arrays;

public class ArrayCopyMaster {
    public static void main(String[] args) {
        int[] source = {1,2 ,3 ,4,5};

        int[] destination = new int[source.length];

        System.out.println(Arrays.toString(destination));

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        System.out.println(Arrays.toString(destination));
    }
}
