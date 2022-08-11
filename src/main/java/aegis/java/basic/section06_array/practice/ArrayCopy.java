package aegis.java.basic.section06_array.practice;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // Метод copyTo()
        {
            int[] donorArray = {1, 2, 3, 4, 9};
            int[] copyArray = Arrays.copyOf(donorArray, donorArray.length);
            System.out.println(Arrays.toString(copyArray));
        }

        // На основе уроков
        {
            int[] array1 = {1, 2, 3, 40, 9};
            int[] array2 = new int[5];

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                        array2[i] = array1[i];
                    }
                    System.out.print(array2[i] + " ");
                }
            }

    }
}