package aegis.java.basic.section09_recursion.practiceMaster;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 1, 6}; // 3
        int query = 6;

        System.out.println(findIndex(array, query, 0));
    }

    // recursion 1
    private static int findIndex(int[] array, int query, int i) {
        if (i == array.length) {
            return -1;
        } else if (array[i] == query) {
            return i;
        } else {
            return findIndex(array, query, i + 1);
        }
    }

    // recursion 2
    private static int findIndexBadExample(int[] array, int query, int i) {
        if (i == array.length) {
            return -1;
        } else {
            var foundIndex = findIndexBadExample(array, query, i + 1);
            if (array[i] == query) {
                return i;
            } else {
                return foundIndex;
            }
        }
    }
}
