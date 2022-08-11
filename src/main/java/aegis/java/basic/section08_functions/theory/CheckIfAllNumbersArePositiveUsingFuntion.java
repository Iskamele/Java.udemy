package aegis.java.basic.section08_functions.theory;

public class CheckIfAllNumbersArePositiveUsingFuntion {
    public static void main(String[] args) {
        int[] array = {1,2,3,-4,5};

        boolean allPositive = isAllPositive(array);
        System.out.println(allPositive ? "All positive" : "Not all positive");
    }

    private static boolean isAllPositive(int[] array) {
        var allPositive = true;
        for (int value : array) {
            if (value < 0) {
                allPositive = false;
                break;
            }
        }
        return allPositive;
    }
}

