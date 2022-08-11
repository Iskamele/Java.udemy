package aegis.java.basic.section09_recursion.practice;

public class LinearSearchUsingRecursionIterative {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 6
        int query = 6;

        System.out.println(findIndex(array, query));
    }

    private static int findIndex(int[] array, int query) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                return i;
            }
        }
        return -1;
    }
}
