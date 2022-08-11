package aegis.java.basic.section08_functions.theory;

public class ArrayElementCountUsingFunction {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;

        int count = getCount(array, element);
        System.out.println(count);
    }

    private static int getCount(int[] array, int element) {
        var count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }
        return count;
    }
}
