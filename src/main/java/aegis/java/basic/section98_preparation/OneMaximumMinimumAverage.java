package aegis.java.basic.section98_preparation;

public class OneMaximumMinimumAverage {
    public static void main(String[] args) {
        int size = 10;
        double[] array = new double[size]; // double[]
        for (int i = 0; i < size; i++) { // i < size
            array[i] = Math.random(); // Math
        }

        double max = array[0];
        double min = array[0];
        double average = 0;

        for (int i = 0; i < array.length; i++) { // array.length / i < array.length
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            average += array[i];
        }
        average = average / size;

        System.out.println("max = " + max); // System.out.
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}

