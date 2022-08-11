package aegis.java.basic.section09_recursion.practice;

public class FindMinElementUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] array) {
        int index = 1;
        return findMinRecursion(array, index, array[0]);
    }

    public static int findMinRecursion(int[] array, int index, int min) {
        if (min > array[index]) {
            min = array[index];
        }
        return (index == array.length - 1) ? min : findMinRecursion(array, index + 1, min);
    }
}
