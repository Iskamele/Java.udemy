package aegis.java.basic.section06_array;

public class ArrayCopyRange {
    public static void main(String[] args) {
        int[] array1 = {1, 99, 103, 15, 5};
        int startIndex = 1;
        int endIndex = 3;

        int[] array2 = new int[5];

        for (int i = startIndex; i < endIndex; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
    }
}