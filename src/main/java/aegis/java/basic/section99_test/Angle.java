package aegis.java.basic.section99_test;

import java.util.Arrays;

public class Angle {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 5, 5, 5, 6, 99};

        int amount = 2;
        int crutch = 0;

        int[] destination;

        if (array.length % 2 != 0) {
            destination = new int[array.length / amount + 1];
            crutch++;
        } else {
            destination = new int[array.length / amount];
        }

        int x = 2;
        while (amount >= x) {

            for (int i = 0; i < array.length / 2; i++) {
                array[i] += array[array.length - i - 1];
                destination[i] = array[i];
            }

            if (crutch == 1) {
                for (int j = destination.length - 1; j >= 1; j--) {
                    destination[j] = array[array.length / 2];
                    break;
                }
            }
            x++;
        }
        System.out.println(Arrays.toString(destination));
    }
}
