package aegis.java.basic.section06_array;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] array1 = {5,5,10,10,20};

        int result =0;

        for (int i = 0; i < array1.length; i++) {
            result += array1[i];

        }
        System.out.println(result);
    }
}
