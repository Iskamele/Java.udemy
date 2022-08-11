package aegis.java.basic.section09_recursion.practice;

public class WRONGLinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 1, 6}; // 3
        int query = 6;

        System.out.println(findIndex(array, query, 0,0));
        System.out.println(findIndex(array, query));
    }

    // recursion 1

    // recursion 2
    private static int findIndex(int[] array, int query, int index, int count) {
        if (index == array.length) {
            return count;
        } else {
            if (array[index] == query){
                return findIndex(array, query, index + 1, count + 1);
            } else {
                return findIndex(array, query, index + 1, count);
            }
        }
    }

    // recursion 3
    private static int findIndex(int[] array, int query){
        int index = 0;
        int count = 0;
        return findIndex2(array, query, index, count);
    }

    private static int findIndex2(int[] array, int query, int index, int count) {
        if (index == array.length) {
            return count;
        } else {
            if (array[index] == query){
                return findIndex(array, query, index + 1, count + 1);
            } else {
                return findIndex(array, query, index + 1, count);
            }
        }
    }
}