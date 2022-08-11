package aegis.java.basic.section09_recursion.practice;

import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println(guessNumberRecursive(10));
    }

    public static String guessNumberRecursive(int i) {
        var userCase = new Scanner(System.in).nextInt();

        if (i > userCase) {
            System.out.println("number > " + userCase + ". Try again:");
        } else if (i < userCase) {
            System.out.println("number < " + userCase + ". Try again:");
        } else {
            return "Congratulations, you guessed the number!";
        }
        return guessNumberRecursive(10);
    }
}
