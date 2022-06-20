package aegis.java.basic.section99_test;

import java.util.stream.IntStream;


public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > (IntStream.of(classPoints).sum() + yourPoints) / (classPoints.length +1);
    }


    public static void main(String[] args) {
        Kata.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75);
        Kata.betterThanAverage(new int[]{45, 74, 36, 99, 25, 63, 77, 22}, 50);
        Kata.betterThanAverage(new int[]{44, 95, 97, 87, 73, 44, 29, 3}, 40);
        Kata.betterThanAverage(new int[]{56, 78, 34, 54, 12, 33, 25, 54}, 90);
        Kata.betterThanAverage(new int[]{97, 40, 86, 32, 54, 32, 11, 5}, 59);
        Kata.betterThanAverage(new int[]{85, 35, 85, 45, 98, 45, 25, 100}, 69);
        Kata.betterThanAverage(new int[]{35, 13, 77, 65, 75, 35, 22, 34}, 40);
    }
}