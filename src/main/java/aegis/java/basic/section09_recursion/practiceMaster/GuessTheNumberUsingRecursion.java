package aegis.java.basic.section09_recursion.practiceMaster;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        guessNumberRecursion(number);
    }

    private static void guessNumberRecursion(int number) {
        var userCase = new Scanner(System.in).nextInt();
        if (number > userCase) {
            System.out.println("number > " + userCase + ". Try again:");
            guessNumberRecursion(number);
        } else if (number < userCase) {
            System.out.println("number < " + userCase + ". Try again:");
            guessNumberRecursion(number);
        } else {
            System.out.println("Congratulations, you guessed the number!");
        }
    }
}
