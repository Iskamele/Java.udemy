package aegis.java.basic.section09_recursion.practice;

public class WRONGLinearSearchUsingRecursionIterative {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 1, 6}; // 3
        int query = 6;

        System.out.println(findIndex(array, query));
    }

    // iterative
    private static int findIndex(int[] array, int query) {
        int count = 0;

        for (int element : array){
            if (element == query){
                count++;
            }
        }

        return count;
    }
}