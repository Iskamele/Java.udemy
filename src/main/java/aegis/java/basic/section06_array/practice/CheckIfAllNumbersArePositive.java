package aegis.java.basic.section06_array.practice;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 9, 33, 55, 777, 333, 22555};
        //int[] array = {1,4,6,8,-1,33,55,777,333,22555};

        String answer = "All positive";
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                answer = "Not all positive";
            }
        }
        System.out.println(answer);
    }
}
