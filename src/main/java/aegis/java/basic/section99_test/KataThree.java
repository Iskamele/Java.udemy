package aegis.java.basic.section99_test;

public class KataThree {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;

        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];

        }
        sum = (sum + yourPoints) / (classPoints.length + 1);

        return sum < yourPoints;
    }

    public static void main(String[] args) {
        KataThree.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75);
    }
}
