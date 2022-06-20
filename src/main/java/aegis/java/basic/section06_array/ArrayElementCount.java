package aegis.java.basic.section06_array;

public class ArrayElementCount {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        int result = 0;
        for (int value : array) {
            if (value == 2) {
                result += 1;
            }
        }
        System.out.println("2 counted in array :" + result);
    }
}

