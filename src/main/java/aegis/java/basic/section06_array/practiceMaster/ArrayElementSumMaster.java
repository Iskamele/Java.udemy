package aegis.java.basic.section06_array.practiceMaster;

public class ArrayElementSumMaster {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};

        var sum = 0;

        for (int value : array1) {
            sum += value;
        }
        System.out.println(sum);
    }
}
