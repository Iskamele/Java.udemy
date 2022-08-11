package aegis.java.basic.section09_recursion.practice;

public class FindMinElementUsingRecursionIterative {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5};
        System.out.println(findMin(array));
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int element : array){
            if (min > element){
                min = element;
            }
        }

        return min;
    }
}
