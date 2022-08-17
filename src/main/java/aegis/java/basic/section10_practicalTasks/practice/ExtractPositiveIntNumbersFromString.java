package aegis.java.basic.section10_practicalTasks.practice;

import java.util.Arrays;

public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        String input = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";

        int[] numbers = extractPositiveIntNumbersFromString(input);

        System.out.println(Arrays.toString(numbers));
    }

    private static int[] extractPositiveIntNumbersFromString(final String input) {
        int arraySize = 0;

        for (String element : input.split("\\D")) {
            if (element.matches("[\\d]+")) {
                arraySize++;
            }
        }

        int[] numbers = new int[arraySize];
        int index = 0;

        for (String element : input.split("\\D")) {
            if (element.matches("[\\d]+")) {
                numbers[index] = Integer.parseInt(element);
                index++;
            }
        }

        return numbers;
    }
}
