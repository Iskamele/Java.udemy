package aegis.java.basic.section08_functions.theory;

public class ArrayElementStatisticUsingFunctions {

    public static void main(String[] args) {
        // read source data
        int[] array1 = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        displayResults(array1, calculateStatistics(array1));

        System.out.println("----------------------------");

        int[] array2 = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2, 5, 6, 7, 4, 2, 5};
        displayResults(array2, calculateStatistics(array2));
    }

    private static void displayResults(int[] array, int[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "=" + ((double) result[i][1] * 100 / array.length) + " %");
        }
    }

    private static int[][] calculateStatistics(int[] array) {
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            var element = array[i];
            if (!isAlreadyProcessed(unique, count, element)) {
                int number = calculateElementCount(array, i, element);
                count = addToResult(unique, counts, count, element, number);
            }
        }

        return converResult(unique, counts, count);
    }

    private static boolean isAlreadyProcessed(int[] unique, int count, int element) {
        var exists = false;
        for (int j = 0; j < count; j++) {
            if (unique[j] == element) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    private static int calculateElementCount(int[] array, int startIndex, int element) {
        var number = 1;
        for (int j = startIndex + 1; j < array.length; j++) {
            if (element == array[j]) {
                number++;
            }
        }
        return number;
    }

    private static int addToResult(int[] unique, int[] counts, int count, int element, int number) {
        unique[count] = element;
        counts[count] = number;
        count++;
        return count;
    }

    private static int[][] converResult(int[] unique, int[] counts, int count) {
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }
        return result;
    }
}