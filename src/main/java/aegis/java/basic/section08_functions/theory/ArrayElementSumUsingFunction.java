package aegis.java.basic.section08_functions.theory;

public class ArrayElementSumUsingFunction {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};

        int sum = getSum(array1);

        System.out.println(sum);
    }

    private static int getSum(int[] array1) {
        var sum = 0;
        for (int value : array1) {
            sum += value;
        }
        return sum;
    }
}