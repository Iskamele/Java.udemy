package aegis.java.basic.section08_functions;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 75, 20, 1, 3};
        System.out.println(sumOf(array));
    }

    public static int sumOf(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
