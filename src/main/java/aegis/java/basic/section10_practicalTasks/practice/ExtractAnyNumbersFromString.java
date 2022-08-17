package aegis.java.basic.section10_practicalTasks.practice;

import java.util.Arrays;

public class ExtractAnyNumbersFromString {
    public static void main(String[] args) {
        String input = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";

        float[] numbers = extractAnyNumbersFromString(input);

        System.out.println(Arrays.toString(numbers));
    }

    private static float[] extractAnyNumbersFromString(String input) {

        int arraySize = 0;
        for (String element : input.split("[a-zA-Z]|[\\s]")) {
            if (element.matches("\\d")) {
                arraySize++;
            }
        }

        float[] array = new float[arraySize];
        for (String element : input.split("[a-zA-Z]|[\\s]")) {
            if (element.matches("\\d")) {
                array[arraySize] = Integer.parseInt(element);
            }
        }

        return array;
    }
}
