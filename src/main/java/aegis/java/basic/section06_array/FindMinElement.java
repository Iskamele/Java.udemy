package aegis.java.basic.section06_array;

public class FindMinElement {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 8, 0, 5};

        // processing
        int min = array[0];
        for (int value : array) {
            if (value < min) {
            min = value;
            }
        }
        // display results
        System.out.println(min);
    }
}
