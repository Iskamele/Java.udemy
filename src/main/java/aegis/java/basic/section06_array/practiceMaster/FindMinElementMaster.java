package aegis.java.basic.section06_array.practiceMaster;

public class FindMinElementMaster {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 8, 0, 5};

        // processing
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // display results
        System.out.println(min);
    }
}
