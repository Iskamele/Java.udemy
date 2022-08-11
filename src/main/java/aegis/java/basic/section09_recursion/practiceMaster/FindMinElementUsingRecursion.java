package aegis.java.basic.section09_recursion.practiceMaster;

public class FindMinElementUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5};
        System.out.println(findMin(array, 1, array[0]));
        System.out.println(findMin(array, 0));
    }

    // Recursion v1
    private static int findMin(int[] array, int i, int min) {
        if (i == array.length) {
            return min;
        } else {
            // return findMin(array, i + 1, array[i] < min ? array[i] : min);
            return findMin(array, i + 1, Math.min(array[i], min));
        }
    }

    // Recursion v2
    private static int findMin(int[] array, int i){
        if (i == array.length - 1){
            return array[array.length - 1];
        } else {
            var min = findMin(array, i + 1);
                /*
            if (array[i] < min) {
                return array[i];
            } else {
                return min;
            }
                */
            return Math.min(array[i], min);
        }
    }
}
